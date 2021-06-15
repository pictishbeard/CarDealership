import codeClanCars.people.Customer;
import codeClanCars.vehicles.Car;
import codeClanCars.vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Car car;
    private ElectricCar electricCar;

    @Before
    public void before() {
        customer = new Customer(50000);
        car = new Car(20000, "Black", 4, "Petrol");
        electricCar = new ElectricCar(38000, "Silver", 4, "Electric");
    }

    @Test
    public void customerHasMoney(){
        assertEquals(50000, customer.getTotalMoney());
    }

    @Test
    public void customerStartsWithNoVehicles() {
        assertEquals(0, customer.getVehiclesOwned());
    }

    @Test
    public void customerMoneyReducesWhenBuyingCar() {
        customer.buyCar(car);
        assertEquals(30000, customer.getTotalMoney());
    }

    @Test
    public void customerCanAddCarToCollection() {
        customer.addCarToCollection(car);
        assertEquals(1, customer.getVehiclesOwned());
    }
}
