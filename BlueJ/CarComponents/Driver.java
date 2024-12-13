
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private String name;
    private String license;

    /**
     * Constructor for objects of class Driver
     */
    public Driver(String name, String license)
    {
        this.name = name;
        this.license = license;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLicense(){
        return this.license;
    }
}
