
/**
 * Write a description of class PrintedBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintedBook extends Book
{
    // instance variables - replace the example below with your own
    private int numberOfPages;

    /**
     * Constructor for objects of class PrintedBook
     */
    public PrintedBook(String title, String author, String ISBN, int publicationYear, int numberOfPages)
    {
        // initialise instance variables
        super(title, author, ISBN, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public void bookMarkPage(int page){
        if (page <= numberOfPages){
            System.out.println(page + " has been bookmarked");
        }
        System.out.println(page + " doesn't exist");
    }
    
   @Override 
   public void read(){
       System.out.println(this.getTitle() + " has been read .");
   }
   
   
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof PrintedBook)){
            return false;
        }
        
        if (super.equals(obj)){
            PrintedBook alt = (PrintedBook) obj;
            if (alt.numberOfPages == this.numberOfPages);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Number of pages: " + this.numberOfPages;
    }
}
