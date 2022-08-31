import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flights;

    public Airline() {
        this.flights = new ArrayList<>();
    }

    public void add(Flight flight) {
        flights.add(flight);

    }

    public void remove(Flight flight) {
        flights.remove(flight);
    }

    public void getFlights() {
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i));
        }
    }
}
