import codeClanCars.Dealership;
import codeClanCars.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;

    @Before
    public void before(){
        dealership = new Dealership(1000000);
        car = new Car(30000, "Red", 4, "Diesel");
    }

    @Test
    public void hasTillCount(){
        assertEquals(1000000, dealership.getTillCount());
    }

    @Test
    public void vehiclesStockedStarts() {
        assertEquals(0, dealership.getNumberOfVehiclesStocked());
    }

    @Test
    public void canAddVehiclesToStock() {
        dealership.addVehicle(car);
        assertEquals(1, dealership.getNumberOfVehiclesStocked());
    }
}
