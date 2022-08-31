import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        System.out.println("What functionality do you want to perform?");
//        System.out.println("Please type the number from the options below:");
//        System.out.println("1) Display flight");
//        System.out.println("2) Add flight");
//        System.out.println("3) Cancel flight");
//        System.out.println("4) Add passenger");
//        System.out.println("5) Book seat");
//        System.out.println("6) End session");
        Scanner reader = new Scanner(System.in);

        Airline airline = new Airline();
        Flight flight = new Flight("London", 5);
        boolean active = true;
        airline.add(flight);
//
        //while loop
        while (active) {
            System.out.println("What functionality do you want to perform?");
            System.out.println("Please type the number from the options below:");
            System.out.println("1) Display flight");
            System.out.println("2) Add flight");
            System.out.println("3) Cancel flight");
            System.out.println("4) Add passenger");
            System.out.println("5) Book seat");
            System.out.println("6) End session");

            int functionality = reader.nextInt();
            reader.nextLine();

            if (functionality == 1) {
                System.out.println(airline.getFlights());
            } else if (functionality == 2) {
                System.out.println("Destination");
                String destination = reader.nextLine();
                System.out.println("id");
                int id = reader.nextInt();
                Flight newFlight = new Flight(destination, id);
                airline.add(newFlight);
                System.out.println("New flight added to " + destination);
            } else if (functionality == 3) {
                //airline.remove();
                System.out.println("Which flight would you like to cancel?");
                String flightChoice = reader.nextLine();
                airline.remove(flight);
                System.out.println("The flight has been successfully removed");
//                airline.getFlights();
//                String cancelledFlight = reader.nextLine();
            } else if (functionality == 4) {
                System.out.println("Name");
                String name = reader.nextLine();
                System.out.println("Contact number");
                long number = reader.nextLong();
                System.out.println("id");
                int id = reader.nextInt();
                Passenger passenger = new Passenger(name, number, id);
                flight.addPassenger(passenger);
                System.out.println(name + " has been added to flight");
            } else if (functionality == 5) {
                System.out.println("Which isle would you like (1 - 30)?");
                int isle = reader.nextInt();
                reader.nextLine();
                System.out.println("Which seat would you like in the row (a - f)?");
                String seat = reader.nextLine();
                System.out.println(String.format("You have chosen seat %s in isle %s", seat, isle));
                //System.out.println(Flight.bookSeat());
            } else if (functionality == 6) {
                active = false;
            } else {
                System.out.println("Please enter 1 to 6");
            }
        }
    }
}
