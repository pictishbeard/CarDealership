package codeClanCars;

import codeClanCars.people.Customer;
import codeClanCars.vehicles.Vehicle;

public class TransactionManager {

    public TransactionManager(){
    }

    public void transactVehicleSale(Vehicle vehicle, Customer customer) {
        Dealership dealership = vehicle.getDealership();
        dealership.removeVehicleFromDealership(vehicle);
        dealership.addMoneyToTill(vehicle);
        customer.addCarToCollection(vehicle);
        customer.buyCar(vehicle);
    }

}