
/**
 * Write a description of class Motorcycle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    // instance variables - replace the example below with your own
    private boolean hasSideCar;

    /**
     * Constructor for objects of class Motorcycle
     */
    public Motorcycle(String make, String model, int year, boolean hasSideCar)
    {
        // initialise instance variables
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }

    public void wheelie(){
        System.out.println("The motorcyle is popping a wheelie");
    }
    
    @Override
    public String toString(){
        return super.toString() + "/Has a side car - " + hasSideCar;
    }
}
