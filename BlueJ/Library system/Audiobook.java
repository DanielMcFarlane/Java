
/**
 * Write a description of class Audiobook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Audiobook extends Book implements Downloadable
{
    private int fileSize;

    public Audiobook(String title, String author, String ISBN, int publicationYear,int fileSize)
    {
        // initialise instance variables
        
        super(title,author,ISBN,publicationYear); // calling constructor in super class
        this.fileSize= fileSize;
        
    }
    
    @Override 
   public void read(){
       System.out.println(this.getTitle() + " has been listented to.");
   }

   @Override
   public void download(){
       System.out.println(this.getTitle() + " is downloading to your device.");
   }
}
