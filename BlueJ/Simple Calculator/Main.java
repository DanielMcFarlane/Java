import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void Main(String[] args)
    {
        // create scanner objefct
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        while (!scanner.hasNextInt()){
            System.out.println("That's not a number! Try again.");
            scanner.next();
        }
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");        
        while (!scanner.hasNextInt()){
            System.out.println("That's not a number! Try again.");
            scanner.next();
        }
        int num2 = scanner.nextInt();

        System.out.println("Choose your opperator \n1 = +, 2 = -, 3 = *, 4 = / :");
        int opperator = scanner.nextInt();
        
    
        switch (opperator){
            case 1 -> System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            case 2 -> System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            case 3 -> System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            case 4 -> System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            default -> System.out.println("Please enter a correct choice");
            }
    }
}
