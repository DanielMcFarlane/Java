import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void write(String[] args) {
        String filePath = "books.ser";
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(new Book("The life of Bob", "Billy Bob", 1000000));
        books.add(new Book("The advnetures of bob", "Billy Bob", 1000));
        books.add(new Book("The chronicles of Billy Bob jnr", "Billy Bob", 10));
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
            oos.writeObject(books);
        }catch (IOException e){
            System.out.println("Serialization failed: " + e.getMessage());
        }
        
        // try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) { 
            // ArrayList<Book> loadedBooks = (ArrayList<Book>) ois.readObject();
            
            // for (Book book : loadedBooks){
                // System.out.println(book.getDetails());
            // }
            // } catch (IOException | ClassNotFoundException e) { 
            // System.out.println("Deserialization failed: " + e.getMessage()); 
        // }
    }
    
    public static void load(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.ser"))) { 
            ArrayList<Book> loadedBooks = (ArrayList<Book>) ois.readObject();
            
            for (Book book : loadedBooks){
                System.out.println(book.getDetails());
            }
            } catch (IOException | ClassNotFoundException e) { 
            System.out.println("Deserialization failed: " + e.getMessage()); 
        }
    }
}



