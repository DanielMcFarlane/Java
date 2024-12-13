import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args) {
        String csvFile = "grades.csv"; 
            
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))){
            String line;
            String header = reader.readLine();
            int i = 0;
            double average = 0;
            
            while ((line = reader.readLine()) != null){
                try (Scanner scanner = new Scanner(line).useDelimiter(",")){
                    String name = scanner.next();
                    System.out.println("Name: " + name.trim());

                    int age = scanner.nextInt();
                    System.out.println("Age: " + age);
                    String grade = scanner.next();
                    System.out.println("Grade: " + grade.trim() + "\n");
                    
                    i ++;
                    average += age;
                }
            }
            System.out.println("The average age is " + String.format("%.2f", (double)average/i));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}