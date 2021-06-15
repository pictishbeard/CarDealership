import codeClanCars.people.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void before() {
        customer = new Customer(50000);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(50000, customer.getTotalMoney());
    }

    @Test
    public void customerStartsWithNoVehicles() {
        assertEquals(0, customer.getVehiclesOwned());
    }
}
