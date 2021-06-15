package codeClanCars.people;

import codeClanCars.vehicles.Car;
import codeClanCars.vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Vehicle> vehiclesOwned;
    private int money;

    public Customer (int money) {
        this.vehiclesOwned = new ArrayList<>();
        this.money = money;
    }

    public int getTotalMoney() {
        return this.money;
    }

    public int getVehiclesOwned() {
        return this.vehiclesOwned.size();
    }

    public void buyCar(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
    }

    public ArrayList addCarToCollection(Vehicle vehicle) {
        this.vehiclesOwned.add(vehicle);
        return vehiclesOwned;
    }
}
