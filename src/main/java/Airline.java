import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flights;

    public Airline(){
        this.flights = new ArrayList<>();
    }
    public void add(Flight flight){
        flights.add(flight);

    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
