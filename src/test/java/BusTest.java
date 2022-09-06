import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp() {
        bus = new Bus("Next", 10);
        person = new Person();
        busStop = new BusStop("Next");
    }

    @Test
    public void busIsEmpty() {
        assertEquals(0, bus.checkPassengers());
    }

    @Test
    public void addPassengerTest() {
        bus.addPassenger(person);
        assertEquals(1, bus.checkPassengers());
    }

    @Test
    public void canAddPassenger() {
        Bus bus1 = new Bus("Last", 0);
        bus1.addPassenger(person);
        assertEquals(0, bus1.checkPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.checkPassengers());
    }

    @Test
    public void canPickUp() {
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.checkPassengers());
    }



}
