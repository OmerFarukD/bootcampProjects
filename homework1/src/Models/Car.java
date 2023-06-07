package Models;

import Models.enums.CarType;
import Models.enums.Color;

import java.math.BigDecimal;

public abstract class Car {



    public Car(int id,Color color, CarType carType, String marka, int model, double luggageCapacity) {
        this();
        this.id=id;
        this.color = color;
        this.carType = carType;
        this.marka = marka;
        this.model = model;
        this.luggageCapacity = luggageCapacity;
    }

    public Car() {
    }

    private int id;
    private Color color;
    private CarType carType;
    private String marka;
    private int model;
    private double luggageCapacity;

    private double dailyPrice;
    private double monthlyPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    @Override
    public String toString() {
        return "Id :"+id+", Renk :"+color+", Tipi: "+carType+", Marka :"+marka+", Model: "+model+", Bagaj kapasitesi: "+luggageCapacity
                +", Günlük fiyatı: "+dailyPrice+", Aylık fiyatı: "+monthlyPrice;
    }
}
