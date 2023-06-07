package Models;

import Models.enums.CarType;
import Models.enums.Color;

import java.math.BigDecimal;

public class Hatchback extends Car {

    public Hatchback(int id,Color color, String marka, int model, double luggageCapacity) {
        super(id,color, CarType.HATCHBACK, marka, model, luggageCapacity);
    }

    public Hatchback() {
        super();
    }
}
