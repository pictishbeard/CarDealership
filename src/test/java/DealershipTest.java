import codeClanCars.Dealership;
import codeClanCars.TransactionManager;
import codeClanCars.people.Customer;
import codeClanCars.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    private TransactionManager transactionManager;
    private Customer customer;

    @Before
    public void before(){
        dealership = new Dealership(1000000);
        car = new Car(30000, "Red", 4, "Diesel");
        transactionManager = new TransactionManager();
        customer = new Customer(50000);
    }

    @Test
    public void hasTillCount(){
        assertEquals(1000000, dealership.getTillCount());
    }

    @Test
    public void vehicleStockStartsAt0() {
        assertEquals(0, dealership.getNumberOfVehiclesStocked());
    }

    @Test
    public void canAddVehiclesToStock() {
        dealership.addVehicle(car);
        assertEquals(1, dealership.getNumberOfVehiclesStocked());
    }

    @Test
    public void canRemoveVehicleFromStock() {
        dealership.addVehicle(car);
        dealership.removeVehicleFromDealership(car);
        assertEquals(0, dealership.getNumberOfVehiclesStocked());
    }

    @Test
    public void moneyIsDeductedFromTill() {
        dealership.removeMoneyFromTill(car);
        assertEquals(970000, dealership.getTillCount());
    }

    @Test
    public void moneyIsAddedToTill() {
        dealership.addMoneyToTill(car);
        assertEquals(1030000, dealership.getTillCount());
    }

    @Test
    public void transactionMethodWorks() {
        dealership.addVehicle(car);
        transactionManager.transactVehicleSale(car, customer);
        assertEquals(0, dealership.getNumberOfVehiclesStocked());
        assertEquals(1030000, dealership.getTillCount());
        assertEquals(20000, customer.getTotalMoney());
        assertEquals(1, customer.getVehiclesOwned());
    }
}
