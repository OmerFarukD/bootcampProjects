import Business.RentalManager;
import Business.RentalService;
import Models.Customer;
import Models.enums.CustomerType;

public class Main {
    public static void main(String[] args) {

        Customer customer= new Customer();
        customer.setEmail("omer.02@gmail.com");
        customer.setCustomerType(CustomerType.PERSON);
        customer.setPassword("123456");
        RentalService rentalService= new RentalManager(customer);
        rentalService.getRentalVehicles().forEach(x->{
            rentalService.dailyRental(x.getId());
            rentalService.monthlyRental(x.getId());
        });
        rentalService.getRentalVehicles().forEach(x->System.out.println(x.toString()));

    }


}