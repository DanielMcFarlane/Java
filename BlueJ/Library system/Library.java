import java.util.ArrayList;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        if (books.contains(book)){ 
            System.out.println("This book already exists");
            return;
        }
        books.add(book);
    }
    
    
    public void removeBook(Book book){
        if (!books.contains(book)){
            System.out.println("This book does not exist");
            return;
        }
        books.remove(book);
    }
    
    public void printAllBooks(){
        for(Book book: books){
            System.out.println(book);
        }
    }
    
    public void downloadEbooks(){
        for(Book book : books){
            if (book instanceof EBook){
               EBook other = (EBook) book;
               other.downloadBook();
            }
        }
    }
}
