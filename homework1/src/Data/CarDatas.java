package Data;

import Models.Car;
import Models.Hatchback;
import Models.SUV;
import Models.Sedan;
import Models.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class CarDatas {
    private List<Car> cars;

    public CarDatas() {
        this.cars= new ArrayList<>();

        this.cars.add(new SUV(1,Color.BLACK,"BMW",2015,300));
        this.cars.add(new SUV(2,Color.WHITE,"DACIA",2016,450));
        this.cars.add(new SUV(3,Color.YELLOW,"Mercedes",2019,500));
        this.cars.add(new Hatchback(4,Color.RED,"Opel",2012,450));
        this.cars.add(new Hatchback(5,Color.BLUE,"Renault",2020,450));
        this.cars.add(new Hatchback(6,Color.RED,"Peugeot",2012,450));
        this.cars.add(new Sedan(7,Color.BLACK,"Kurşun izli Passat",2015,200));
        this.cars.add(new Sedan(8,Color.WHITE,"BMW ",2020,200));
        this.cars.add(new Sedan(9,Color.BLACK,"BMW",2021,200));
        this.cars.add(new Hatchback(10,Color.BLUE,"BMW",2013,400));
        this.cars.add(new SUV(11,Color.BLACK,"BMW",2012,300));
    }

    public List<Car> getCars(){
        return this.cars;
    }
}
