import codeClanCars.vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;

    @Before
    public void before() {
        hybridCar = new HybridCar(28000, "Blue", 4, "Petrol/Electric");
    }

    @Test
    public void getPrice(){
        assertEquals(28000, hybridCar.getPrice());
    }

    @Test
    public void getColour(){
        assertEquals("Blue", hybridCar.getColour());
    }

    @Test
    public void getTyres(){
        assertEquals(4, hybridCar.getTyres());
    }

    @Test
    public void getFuel(){
        assertEquals("Petrol/Electric", hybridCar.getFuel());
    }
}