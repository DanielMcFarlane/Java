
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher implements Comparable<Teacher>
{
    // instance variables - replace the example below with your own
    private String name;
    private String subject;
    

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher(String name, String subject)
    {
        this.name = name;
        this.subject = subject;
    }
    
      
    public String getName(){
        return this.name;
    }
    
    public String getSubject(){
        return this.subject;
    }
    
      
    @Override
    public int compareTo(Teacher other){
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return "Teacher name: " + name +
                ", Subject taught: " + subject;
    }
}
