
/**
 * Write a description of class ComparisonDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComparisonDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Student student1 = new Student("Alice");
        Student student2 = new Student("Alice");
        Student student3 = student1;
        
        System.out.println(student1 == student2);
        System.out.println(student1== student3);
        System.out.println(student1.equals(student2));
    }
}
