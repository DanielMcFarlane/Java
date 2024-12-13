import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReservationClass {
    private String reservationID;
    private Room room;
    private User user;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public ReservationClass(String reservationID, Room room, User user, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationID = reservationID;
        this.room = room;
        this.user = user;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        checkDates();
    }

    public ReservationClass() {
        this.reservationID = "hotel123";
        this.room = new Room();
        this.user = new User();
        this.checkInDate = LocalDate.of(2024, 10, 1);
        this.checkOutDate = LocalDate.of(2024, 10, 4);
        checkDates();
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
    
    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
        checkDates(); 
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
        checkDates(); 
    }
    
    private void checkDates() {
        if (checkInDate.isAfter(checkOutDate)) {
            throw new IllegalArgumentException("Check-in date cannot be after check-out date.");
        }
    }
    
    
    // public String toString(){
        // String r = "check in date"+this.checkInDate.toString() +"\n"+"check out date"+this.checkOutDate.toString() ;
        // return r;
    // }
    
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
