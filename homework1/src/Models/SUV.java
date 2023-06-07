package Models;

import Models.enums.CarType;
import Models.enums.Color;

public class SUV extends Car{
    public SUV(int id,Color color, String marka, int model, double luggageCapacity) {
        super(id,color, CarType.SUV, marka, model, luggageCapacity);
    }

    public SUV() {
        super();
    }


}
