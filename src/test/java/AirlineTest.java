import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Airline airline;
    private Flight flight1;
    private Flight flight2;
    private Flight flight3;
    private Flight flight4;

    @BeforeEach
    public void setUp(){
        //Adding flights to ArrayList
        airline = new Airline();
        flight1 = new Flight("Paris", 1);
        flight2 = new Flight("Gatwick", 2);
        flight3 = new Flight("Malaga", 3);
        flight4 = new Flight("London", 4);
        airline.add(flight1);
        airline.add(flight2);
        airline.add(flight3);
    }

    @Test
    public void canGetFlight(){
        // checking that method prints ArrayList of flights
        List<Flight> expected = Arrays.asList(flight1, flight2, flight3);
        List<Flight> actual = airline.getFlights();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddFlight(){
        airline.add(flight4);
        List<Flight> expected = Arrays.asList(flight1, flight2, flight3, flight4);
        List<Flight> actual = airline.getFlights();
        assertEquals(expected, actual);
    }

    @Test
    public void canRemoveFlight(){
        airline.remove(flight3);
        List<Flight> expected = Arrays.asList(flight1, flight2);
        List<Flight> actual = airline.getFlights();
        assertEquals(expected, actual);
    }

}
