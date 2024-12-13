import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
    private ArrayList<Student> students ;
    
    /**
     * Constructor for objects of class Students
     */
    public Students()
    {   
         this.students = new ArrayList<>();
    }

    
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added: " + student.getFirstName() + " " + student.getLastName());
    }
    
    
    public void removeStudent(int studentID){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student= iterator.next();
            if(student.getStudentID() == studentID){
                iterator.remove();
                System.out.println("Student with ID " + studentID + " removed.");
            }
        }
    }
    
    
    public Student findSudentByID(int studentID){
        for (Student student : students){
            if (student.getStudentID() == studentID){
                return student;
            }
        }
        return null;
    }
    
    
    public void displayAllStudents(){
        for (Student student : students){
            System.out.println(student.getStudentID() + " " + student.getFirstName()
            + " " + student.getLastName() + " " + student.getEmail());
        }
    }
}



 // Methods will include addStudent
 // removeStudent
 // findStudentByID
 // and displayAllStudents.
 
 