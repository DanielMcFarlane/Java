import java.util.ArrayList;

/**
 * Write a description of class Users here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Users
{
    private ArrayList<User> users;
    
    /**
     * Constructor for objects of class Users
     */
    public Users()
    {
        users = new ArrayList<>();
    }
    
    
    public User findUser(String username){
        for (User user : users){
            if(user.getUserName().equals(username)){
                return user;
            }
        }
        return null;
    }

    
    public void registerUser(String username, String password, String email, String phoneNumber){
        User checkUser = findUser(username);
        
        if (checkUser != null){
            System.out.println(username + " is already registered.");
            return;
        }
        
        User newUser = new User(username, password, email, phoneNumber);
        users.add(newUser);
        System.out.println(username+ " successfuly registered.");
    }
    
    
    public void loginUser(String username, String password){
        User loginUser = findUser(username);
        
        if (loginUser == null){
            System.out.println("User not found.");
            return;
        }
        
        if (loginUser.checkPassword(password)){
            System.out.println(username + " successfully logged in.");
            return;
        }
        
        System.out.println("Incorrect password.");
    }
}
