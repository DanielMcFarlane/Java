import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Room doubleRoom = new Room(249, "Double", 2, 200.00);
        
        User dan = new User("Daniel McFarlane", "dan@gmail.com", "07123456789", "dan123");
        
        LocalDate checkInDate = LocalDate.of(2024, 10, 3);
        LocalDate checkOutDate = LocalDate.of(2024, 10, 9);
        ReservationClass reservation1 = new ReservationClass("Double123", doubleRoom, dan, checkInDate, checkOutDate);
        
    
        System.out.println("Room Information:");
        doubleRoom.showDetails();
        System.out.println();
    

        System.out.println("User Information:");
        dan.showDetails();
        System.out.println();
        

        System.out.println("Reservation Information:");
        reservation1.showDetails();
        System.out.println();
    }
}




        // Car bmw = new Car("BMW", "5 Series");
        // Car audi = new Car("Audi", "A6");
        // Person daniel = new Person("Daniel");
        // Person jordan = new Person("Jordan");
        // // call acquireCar on the people objects to associate owners with cars
        // daniel.acquireCar(bmw);
        // jordan.acquireCar(audi);
        // daniel.displayOwnership();
        // jordan.displayOwnership();
        
        
        