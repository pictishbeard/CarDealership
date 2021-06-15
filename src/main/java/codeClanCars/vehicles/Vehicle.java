package codeClanCars.vehicles;

public abstract class Vehicle {
    private int price;
    private String colour;
    private int tyres;
    private String fuel;

    public Vehicle(int price, String colour, int tyres, String fuel) {
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
        this.fuel = fuel;
    }
    
    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return colour;
    }

    public int getTyres() {
        return tyres;
    }

    public String getFuel() {
        return fuel;
    }
}
