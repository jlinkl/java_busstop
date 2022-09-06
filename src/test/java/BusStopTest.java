import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person passenger;

    @Before
    public void before() {
        busStop = new BusStop("Next");
        passenger = new Person();
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, busStop.checkQueue());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addToQueue(passenger);
        assertEquals(1, busStop.checkQueue());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addToQueue(passenger);
        busStop.removeFromQueue();
        assertEquals(0, busStop.checkQueue());
    }
}
