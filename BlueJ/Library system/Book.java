public abstract class Book {
   private static int nextId=1; 
  
   private int bookId; 
   private String title;
   private String author;
   private String ISBN;
   private int publicationYear;

   public Book(String title, String author, String ISBN, int publicationYear) {
       this.bookId= nextId++;
       this.title = title;
       this.author = author;
       this.ISBN = ISBN;
       this.publicationYear = publicationYear;
   }

   public String getTitle(){
       return this.title;
   }
   
   public String getAuthor(){
       return this.author;
   }
   
   public String getISBN(){
       return this.author;
   }
   
   public abstract void read();
   
   @Override
   public boolean equals(Object obj) {
       if (this == obj) { 
           return true; // checks if this object and object being passed to equals are same memoryaddress 
        }
       if (obj == null ) { 
           return false; 
        }
       Book book = (Book) obj; 
       return ISBN.equals(book.ISBN);
   }

   @Override
   public String toString() {
       return title + " by " + author + " (" + publicationYear + ")";
   }
}
