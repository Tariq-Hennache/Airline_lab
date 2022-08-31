import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Airline airline;
    private Flight flight1;
    private Flight flight2;
    private Flight flight3;
    private ArrayList<Flight> flights;

    @BeforeEach
    public void setUp(){
        //Adding flights to ArrayList
        flights = new ArrayList<Flight>();
        flight1 = new Flight("Paris", 1);
        flight2 = new Flight("Gatwick", 2);
        flight3 = new Flight("Malaga", 3);
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
    }

    @Test
    public void canDisplayFlight(){
        // checking that method prints ArrayList of flights
        ArrayList expected = new ArrayList<>();
        ArrayList actual = airline.displayFlight();
        assertEquals(expected, actual);
    }

}
