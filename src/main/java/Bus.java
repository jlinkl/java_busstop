import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int checkPassengers() {return this.passengers.size(); }

    public void addPassenger(Person passenger) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public void pickUp(BusStop busStop) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(busStop.removeFromQueue());
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

}
