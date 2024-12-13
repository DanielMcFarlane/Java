
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
        
        //Book book1 = new Book("a title", "an author", "6127w62", 1999);
        //EBook book2 = new EBook("book2"," title", "book2 author", "22222", 1992);
        
        EBook book3 = new EBook(" The wonderful life of Billy Bob Snr", "book2 author","36235367", 1992,2048);
        PrintedBook book4 = new PrintedBook("The life of Billy Bob", "Billy Bob Jnr", "8342", 2014, 1000);
        Audiobook book5 = new Audiobook(" The life and death of Billy Bob Jnr", "book2 author","36235367", 1992,2048);

        //book3.downloadBook();
        
        book3.read();
        book4.read();
        book5.read();
        
        book3.download();
        book5.download();

        
        // System.out.println(book3);
        // System.out.println(book4);
    }
    
}
