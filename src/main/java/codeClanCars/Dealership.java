package codeClanCars;

import codeClanCars.vehicles.Car;
import codeClanCars.vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    ArrayList<Vehicle> vehiclesStocked;
    int till;

    public Dealership ( int till ) {
        this.till = till;
        this.vehiclesStocked = new ArrayList<>();

    }

    public int getTillCount() {
        return this.till;
    }

    public int getNumberOfVehiclesStocked() {
        return this.vehiclesStocked.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesStocked.add(vehicle);
    }
}
