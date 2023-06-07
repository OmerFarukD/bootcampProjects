package Business;

import Models.Car;

import java.util.List;

public interface RentalService {

    void dailyRental(int id);
    void monthlyRental(int id);

    List<Car> getRentalVehicles();
}
