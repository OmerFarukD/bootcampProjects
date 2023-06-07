package Business;

import Data.CarDatas;
import Models.Car;
import Models.Customer;
import Models.enums.CarType;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class RentalManager implements RentalService{


    private Customer customer;
    private CarDatas carDatas;

    public RentalManager(Customer customer) {
       this.customer=customer;
        this.carDatas=new CarDatas();
    }

    @Override
    public void dailyRental(int id) {

        if (isRentable(id)){
            Car rentCar=this.carDatas.getCars().stream().filter(x->x.getId()==id).findFirst().get();
            dailyRentalRules(rentCar);
        }else {
            System.out.println("Aradığınız araç bulunamamıştır.");
        }
    }

    @Override
    public void monthlyRental(int id) {
        if (isRentable(id)){
            Car rentCar=this.carDatas.getCars().stream().filter(x->x.getId()==id).findFirst().get();
            dailyRentalRules(rentCar);
            rentCar.setMonthlyPrice(rentCar.getDailyPrice()*30);
        }else {
            System.out.println("Aradığınız araç bulunamamıştır.");
        }
    }


    @Override
    public List<Car> getRentalVehicles() {

        switch (customer.getCustomerType()){
            case PERSON ->{
             return this.carDatas.getCars().stream().filter(x->x.getCarType()==CarType.HATCHBACK).toList();
            }
            case COMPANY -> {
                return this.carDatas.getCars();
            }
            default -> {
                return  new ArrayList<>();
            }
        }
    }

    private void dailyRentalRules(Car car){

        int localYear= Year.now().getValue();
        double yearDifferencePrice=(localYear+car.getModel())*0.040;

        switch (car.getCarType()){
            case SEDAN -> {
                car.setDailyPrice((car.getLuggageCapacity()*1+100)+(yearDifferencePrice));
            }
            case SUV -> {
                car.setDailyPrice((car.getLuggageCapacity()*1.5+100)+(yearDifferencePrice));
            }
            case HATCHBACK -> {
                car.setDailyPrice((car.getLuggageCapacity()*1.4+100)+(yearDifferencePrice));
            }
        }
    }

    private boolean isRentable(int id){
        List<Car> cars=this.getRentalVehicles();
        return cars.stream().anyMatch(x->x.getId()==id);
    }
}
