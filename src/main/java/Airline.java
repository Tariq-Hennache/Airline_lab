import java.util.ArrayList;

public class Airline {

    private ArrayList<Flight> flights;

    public Airline(){
        this.flights = new ArrayList<>();
    }

    public ArrayList<Flight> displayFlight(){
        return (flights);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
