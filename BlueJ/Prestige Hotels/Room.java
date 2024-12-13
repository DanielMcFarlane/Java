
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    //private static int roomNumber = 1;
    private int roomNumber;
    private String roomType;
    private int capacity;
    private double price;
    private boolean isVacant;

    /**
     * Constructor for objects of class Room
     */
    public Room(int roomNumber, String roomType, int capacity, double price)
    {
        // initialise instance variables
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.price = price;
        this.isVacant = true;
    }
    
    public Room()
    {
        // initialise instance variables
        this.roomNumber = roomNumber;
        this.roomType = "double";
        this.capacity = 2;
        this.price = 200.00;
        this.isVacant = true;
    }

    
    
    public int getRoomNumber(){
        return roomNumber;
        //return roomNumber++;
    }
    
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    
    
    
    public String getRoomType(){
        return roomType;
    }
    
    public void setRooomType(String roomType){
        this.roomType = roomType;
    }
    
    
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    
    
    public boolean getIsVacant(){
        return isVacant;
    }
    
    public void setIsVacant(boolean isVacant){
        this.isVacant = isVacant;
    }
    
    
    
    public void showDetails(){
        System.out.println("Room number: " + roomNumber +
                            "\nRoom type: " + roomType +
                            "\nCapacity: " + capacity +
                            "\nPrice: " + price +
                            "\nIs vacant: " + isVacant);
    }
    
}
