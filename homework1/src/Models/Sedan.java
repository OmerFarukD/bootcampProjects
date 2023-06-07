package Models;

import Models.enums.CarType;
import Models.enums.Color;

import java.math.BigDecimal;

public class Sedan extends Car{

    public Sedan(int id,Color color, String marka, int model, double luggageCapacity) {
        super(id,color, CarType.SEDAN, marka, model, luggageCapacity);
    }

    public Sedan() {
        super();
    }
}
