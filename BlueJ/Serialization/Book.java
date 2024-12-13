import java.io.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book implements Serializable
{
    private static final long serialVersionUID = 1L;    
    private String title;
    private String author;
    private double price;

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author , double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getDetails(){
        return String.format("Title: " + title +
                            "/Author: " + author +
                            "/Price : " + price);
    }
}

