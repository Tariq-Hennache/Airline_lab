import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class FlightTest {


    private Flight flight;
    private Passenger passenger;

    private ArrayList<Passenger> passengers;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Paris", 1);
        passenger = new Passenger("John", 07717140176, 2);
        passengers = new ArrayList<Passenger>();
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        int expected = 1;
        int actual = flight.getPassengers().size();
        assertEquals(expected, actual);

    }

    @Test
    public void canBookSeat(){
        String expected = "John has been assigned seat 12A";
        String actual = flight.bookSeat(passenger, "12A");
        assertEquals(expected, actual);
    }
}
