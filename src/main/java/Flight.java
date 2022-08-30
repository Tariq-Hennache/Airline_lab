import java.util.ArrayList;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int id){
        this.destination = destination;
        this.id = id;
        this.passengers = new ArrayList<>();

    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }


    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public String bookSeat(Passenger passenger, String seat){
        return String.format("%s has been assigned seat %s", passenger.getName(), seat);
    }


}
