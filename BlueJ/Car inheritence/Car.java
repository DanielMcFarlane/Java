
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    // instance variables - replace the example below with your own
    private int numDoors;
    private int numSeats;

    /**
     * Constructor for objects of class Car
     */
    public Car(String make, String model, int year, int numDoors, int numSeats)
    {
        // initialise instance variables
        super(make, model, year);
        this.numDoors = numDoors;
        this.numSeats = numSeats;
    }

    public void honkDaHorn(){
        System.out.println("Da horn is honking. Honk honk.");
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                "/Number of doors - " + numDoors +
                "/Number of seats - " + numSeats;
    }
}
