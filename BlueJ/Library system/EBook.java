
/**
 * Write a description of class EBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EBook extends Book implements Downloadable
{
    // instance variables - replace the example below with your own
    private int fileSize;

    /**
     * Constructor for objects of class EBook
     */
    public EBook(String title, String author, String ISBN, int publicationYear,int fileSize)
    {
        // initialise instance variables
        
        super(title,author,ISBN,publicationYear); // calling constructor in super class
        this.fileSize= fileSize;
        
    }
    
    public int getFileSize(){
        return this.fileSize;
    }
    
    public void downloadBook(){
        System.out.println("Downloading " + super.getTitle() +
                             "\nFileSize: " + this.fileSize + "MB");
    }

   @Override 
   public void read(){
       System.out.println(this.getTitle() + " has been read .");
   }
   
   @Override 
   public void download(){
       System.out.println(this.getTitle() + " is downloading.");
   }
    
   @Override
   public boolean equals(Object obj){
       if (!(obj instanceof EBook)){
           return false;
       }
       
       if (super.equals(obj)){
           EBook oth = (EBook) obj; //cast as EBook
           if (oth.fileSize == this.fileSize){
               return true;
           }
       }
       return false;
   }
   
   @Override 
   public String toString(){
       return super.toString() + " FileSize "+ this.fileSize;
   }
}
