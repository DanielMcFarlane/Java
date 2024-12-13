/**
* Write a description of class Car here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Car {
    private Engine engine;
    private Trailer trailer;
    private Driver driver;
 
    
    public Car()
    {
        engine = new Engine();
    }

 
    public void attatchTrailer(Trailer trailer)
    {
        this.trailer = trailer;
    }
    
    public void startCar(Engine engine)
    {
        this.engine.start();
    }
    
    public void stopCar(Engine engine)
    {
        this.engine.stop();
    }
    
    public void isTowing()
    {
        if (trailer == null){
            System.out.println("The trailer is not attatched");
        }
        else{
            System.out.println("The trailer is attatched");
        }
    }
    
    public void detatchTrailer()
    {
        if (trailer != null){
            trailer = null;
        }
    }
    
    public void addDriver(Driver driver){
        this.driver = driver;
    }
    
    public void carStatus(){
        System.out.println("**** Car Status Report ****");
        
        if (this.engine.getRunning() == true){
            System.out.println("The engine is running");
        }else{
            System.out.println("The engine is not running");
        }
        
        if (this.trailer == null){
            System.out.println("The trailer is detatched");
        }else{
            System.out.println("The trailer is attatched");
        }
        
        if (this.driver == null){
            System.out.println("The car does not have a driver");
        }else{
            System.out.println("The driver is " + this.driver.getName() + ". The driver license is " + this.driver.getLicense());

        }
    }
    }
    // TODO: Create a private field for the car's engine (composition).

    // TODO: Create a private field for the car's trailer (aggregation).

    // TODO: Create a constructor for the Car class.
    // Inside the constructor, create an Engine object and set it as the car's engine (composition).

    // TODO: Create a method to attach a trailer to the car.
    // This method should take a Trailer object as a parameter and set it as the car's trailer (aggregation).

    // TODO: Create a method to start the car.
    // Inside this method, call the start method of the car's engine object and print a message indicating that the engine is started.

    // TODO: Create a method to indicate whether the car is towing a trailer.
    // Check if a trailer is attached to the car (i.e., the trailer variable is not null).
    // If a trailer is attached, print a message indicating that the car is towing the trailer.
    // If no trailer is attached, print a message indicating that the car is not towing a trailer.
