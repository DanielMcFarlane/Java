import java.io.*;
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
       String inputFile = "input.txt";
       String outputFile = "output.txt";
       try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
           String line;
           
           while ((line = reader.readLine()) != null) {
               writer.write(line.toUpperCase());
               writer.newLine();
                // String data = "";
                // data +=line.toUpperCase();
                // System.out.println(data);
                // writer.write(data+"\n");
           }
           System.out.println("File processed successfully.");
       } catch (IOException e) {
           System.out.println("An error occurred: " + e.getMessage());
       }
    }
}
