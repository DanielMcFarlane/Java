
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Users class
        System.out.println();
        System.out.println();
        System.out.println();
        Users users = new Users();

        // Register a new user
        users.registerUser("alice", "alicePass", "alice@example.com", "1122334455");

        // Attempt to log in with registered and unregistered users
        users.loginUser("john_doe", "password123"); // Should succeed    Should this not fail?
        users.loginUser("alice", "wrongPass"); // Should fail
        users.loginUser("unknown_user", "somePass"); // Should fail
        
        
        
        System.out.println();
        Users user1 = new Users();
        Users user2 = new Users();

        System.out.println();
        user1.registerUser("TheRealBillyBob1", "billybob123", "billy@bob.com", "3945824951");
        user2.registerUser("Daniel", "dan123", "dan@bob.com", "39951");
        
        System.out.println();
        user1.loginUser("TheRealBillyBob1", "billybob123"); // Should succeed
        user1.loginUser("unknown_user", "billybob123"); // Should fail, wrong username
        user1.loginUser("TheRealBillyBob1", "wrongPass"); // Should fail, wrong password
        
        System.out.println();
        user2.loginUser("Daniel", "dan123"); // Should succeed
        user2.loginUser("unknown_user", "dan123"); // Should fail, wrong username
        user2.loginUser("Daniel", "wrongPass"); // Should fail, wrong password
    }
}

