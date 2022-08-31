public class Passenger {

    private String name;
    private long contactNumber;
    private int id;

    public Passenger(String name, long contactNumber, int id){
        this.name = name;
        this.contactNumber = contactNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
