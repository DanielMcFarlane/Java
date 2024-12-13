
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
   private String make;
    private String model;
    private int year;

    /**
     * Constructor for objects of class Vehical
     */
    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void start(){
        System.out.println("The engine has started");
    }
    
    public void stop(){
        System.out.println("The engine has stopped");
    }
    
    public void accelerate(){
        System.out.println("The vehical is accelerating");
    }
    
    public void brake(){
        System.out.println("The vehical is braking");
    }
    
    @Override
    public String toString(){
        return "Make - " + make +
                "/Model - " + model +
                "/Year - " + year;
    }
}
