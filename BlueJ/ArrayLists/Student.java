
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private static int nextStudentID = 1;
    private int studentID;
    private String firstName;
    private String lastName;
    private String email;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String firstName, String lastName, String email)
    {
        this.studentID = nextStudentID;
        nextStudentID ++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    
    public int getStudentID(){
        return studentID;
    }
    
    public void setStudentID(){
        this.studentID = studentID;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName  = firstName;
    }
    
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(){
        this.lastName = lastName;
    }
    
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(){
        this.email = email;
    }
}
