import codeClanCars.Dealership;
import codeClanCars.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private Dealership dealership;

    @Before
    public void before() {
        car = new Car(20000, "Black", 4, "Petrol");
        dealership = new Dealership(1000000);
    }

    @Test
    public void hasPrice() {
        assertEquals(20000, car.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", car.getColour());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, car.getTyres());
    }

    @Test
    public void hasFuel() {
        assertEquals("Petrol", car.getFuel());
    }

    @Test
    public void vehicleHasDealership() {
        dealership.addVehicle(car);
        assertEquals(dealership, car.getDealership());
    }
}
