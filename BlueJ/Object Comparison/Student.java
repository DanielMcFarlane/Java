
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name)
    {
        name = this.name;
    }

    public String getName(String name){
        return this.name;
    }
    
    @Override 
    public boolean equals(Object obj){ 
    { 

	Student other = (Student) obj; 
        if (this.name == other.name){
            return true;
        }else{
            return false;
        }
    } 
    }
}

