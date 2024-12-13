
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Comparable<Student>
{
    // instance variables - replace the example below with your own
    private static int nextID = 1;
    private int studentID;
    private String studentName;
    

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentName)
    {
        // initialise instance variables
        this.studentID = nextID ++;
        this.studentName = studentName;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public String getStudentName(){
        return this.studentName;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    @Override
    public int compareTo(Student other){
        return this.studentName.compareTo(other.studentName);
    }
    
    @Override
    public String toString() {
        return "Student ID: " + studentID +
                ", Student name: " + studentName;
    }
}
