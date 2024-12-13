import java.util.Collections;
import java.util.ArrayList;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void Main()
    {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    
    Student s1 = new Student("Abdullah");
    Student s2 = new Student("Annoying Jordan");
    Student s3 = new Student("Daniel");

    students.add(s1);
    students.add(s2);
    students.add(s3);

    Collections.sort(students);
    
    for (Student student : students){
        System.out.println(student);
        //System.out.println("ID: " + student.getStudentID() + " Name: " + student.getStudentName());
    }
    
    Teacher teach1 = new Teacher("Joe", "History");
    Teacher teach2 = new Teacher("Biden", "Even older history");
    
    teachers.add(teach1);
    teachers.add(teach2);
    
    Collections.sort(teachers);
    
    for (Teacher teacher : teachers){
        System.out.println(teacher);
        //System.out.println(teacher.getName() + " teaches " + teacher.getSubject());
    }
    }
}
