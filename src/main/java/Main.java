import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("What functionality do you want to perform?");
        System.out.println("Please type the number from the options below:");
        System.out.println("1) Display flight");
        System.out.println("2) Add flight");
        System.out.println("3) Cancel flight");
        System.out.println("4) Add passenger");
        System.out.println("5) Book seat");
        Scanner reader = new Scanner(System.in);

        Airline airline = new Airline();
        Flight flight = new Flight("London", 5);

        //while loop
        int functionality = reader.nextInt();
        reader.nextLine();

        if (functionality == 1){
            airline.getFlights();
        } else if (functionality == 2){
            System.out.println("Destination");
            String destination = reader.nextLine();
            System.out.println("id");
            int id = reader.nextInt();
            Flight newFlight = new Flight(destination, id);
            airline.add(newFlight);
        } else if (functionality == 3){
            //airline.remove();
        } else if (functionality == 4){
            System.out.println("Name");
            String name = reader.nextLine();
            System.out.println("Contact number");
            int number = reader.nextInt();
            System.out.println("id");
            int id = reader.nextInt();
            Passenger passenger = new Passenger(name, number, id);
            flight.addPassenger(passenger);
        } else if (functionality == 5){
            //System.out.println(Flight.bookSeat());
        } else {
            System.out.println("Please enter 1 to 5");
        }
    }
}
