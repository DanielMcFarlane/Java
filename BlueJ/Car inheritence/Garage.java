import java.util.ArrayList;

/**
 * Write a description of class Garage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Garage
{
    // instance variables - replace the example below with your own
    private ArrayList<Vehicle> vehicles;
    
    /**
     * Constructor for objects of class Garage
     */
    public Garage()
    {
        // initialise instance variables
        vehicles = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            System.out.println("This vehical already exists");
        }
        vehicles.add(vehicle);
    }
    
    public void test(){
        for (Vehicle vehicle : vehicles) {
            System.out.println("\n" + vehicle.toString());

            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            vehicle.stop();

            if (vehicle instanceof Car) {
                ((Car) vehicle).honkDaHorn();
            } 
            
            if (vehicle instanceof Motorcycle) {
                ((Motorcycle) vehicle).wheelie();
            }
        }
    }
}

