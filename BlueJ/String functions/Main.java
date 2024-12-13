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
    // public static void main(String[] args)
    // {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a word: ");
        // String name = scanner.nextLine();
        
        // int index  = name.indexOf("a");
        
        // if  (index != -1){
            // System.out.println("The letter A is at possition " + index);

        // }else{
            // System.out.println("The letter A is not found");
        // }
        
    // }
    
    // public static void main(String[] args)
    // {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a word: ");
        // String input = scanner.nextLine();
        
        // int length = input.length();
        
        
        // for (int i = 0; i < input.length(); i++) {
            // System.out.println(input.charAt(i));
        // }
        
    // }
    
    // public static void main(String[] args)
    // {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a word: ");
        // String input = scanner.nextLine();
        
        // int length = input.length();
        
        // for (int i = input.length() -1; i >=0; i--) {
            // System.out.println(input.charAt(i));
        // }
    // }
    
    // public static void main(String[] args)
    // {
        // String reverse = "";

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your first name: ");
        // String first = scanner.nextLine();
        // System.out.println("Enter your last name: ");
        // String last = scanner.nextLine();
        
        // char ch = first.charAt(0);
        
        // for (int i = last.length() -1; i >=0; i--) {
             // reverse = reverse + last.charAt(i);
        // }
        
        // System.out.println(ch + reverse);
    // }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String input = scanner.nextLine();
        

        String lowercase = input.toLowerCase();

        String reverse = "";
        for (int i = lowercase.length() - 1; i >= 0; i--){
            reverse += lowercase.charAt(i);
        }
        
        if (lowercase.equals(reverse)){
            System.out.println("This is a palindrome.");
        }else{
            System.out.println("This is not a palindrome.");
        }
    }
}
