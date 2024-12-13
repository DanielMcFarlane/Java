import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class ReservationClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReservationClass
{
    // instance variables - replace the example below with your own
    private String reservationID;
    private Room room;
    private User user;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    

    /**
     * Constructor for objects of class ReservationClass
     */
    public ReservationClass(String reservationID, Room room, User user,LocalDate checkInDate, LocalDate checkOutDate)
    {
        // initialise instance variables
        
        this.reservationID = reservationID; 
        this.room = room;
        this.user = user;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room.setIsVacant(false);
        
    }
    
    public ReservationClass()
    {
        // initialise instance variables
        this.reservationID = "hotel123";
        this.room = new Room();
        // this.room = = room;
        this.user = new User();
        this.checkInDate = LocalDate.of(2024, 10, 3);
        this.checkOutDate = LocalDate.of(2024, 10, 4);
        this.room.setIsVacant(false);
    }

    
    
    public String getReservationID(){
        return reservationID;
    }
    
    public void setReservationID(String reservationID){
        this.reservationID = reservationID;
    }
    
    
    
    public LocalDate getCheckInDate(){
        return checkInDate;
    }
    
    public void setCeckInDate(LocalDate checkInDate){
        this.checkInDate = checkInDate;
    }
    
    
    
    public LocalDate getCheckOutDate(){
        return checkOutDate;
    }
    
    public void setCeckOutDate(LocalDate checkOutDate){
        this.checkOutDate = checkOutDate;
    }
    
    public String toString(){
        String r = "check in date"+this.checkInDate.toString() +"\n"+"check out date"+this.checkOutDate.toString() ;
        return r;
    }
    
    public double calculateCost(){
        long daysBetween = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return daysBetween * room.getPrice() ;
    }
    
    public void showDetails(){
        System.out.println("Reservation ID: " + reservationID +
                            "\nRoom number: " + room.getRoomNumber() +
                            "\nCheck in date: " + checkInDate +
                            "\nCheck out date: " + checkOutDate +
                            "\nTotal cost: " + calculateCost());
    }
}
