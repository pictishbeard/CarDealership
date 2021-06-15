import codeClanCars.vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EletricCarTest {

    private ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar(38000, "Silver", 4, "Electric");
    }

    @Test
    public void getPrice(){
        assertEquals(38000, electricCar.getPrice());
    }

    @Test
    public void getColour(){
        assertEquals("Silver", electricCar.getColour());
    }

    @Test
    public void getTyres(){
        assertEquals(4, electricCar.getTyres());
    }

    @Test
    public void getFuel(){
        assertEquals("Electric", electricCar.getFuel());
    }
}
