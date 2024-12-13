
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
        this.name = "Billy Bob";
        this.age = 20;
    }

    /**
     * Person Constructor
     *
     * @param name A parameter
     * @param age A parameter
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }
    
    
    /**
     * Method getAge
     *
     * @return The return value
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Method setName
     *
     * @param name A parameter
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method setAge
     *
     * @param age A parameter
     */
    public void setAge(int age)
    {
        this.age = age;
    }

}
