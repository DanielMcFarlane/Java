import java.util.Objects;

/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    private String username;
    private int passwordHash;
    private String email;
    private String phoneNumber;

    /**
     * Constructor for objects of class User
     */
    public User(String username, String password, String email, String phoneNumber)
    {
        this.username = username;
        this.passwordHash = hashPassword(password);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    
    public String getUserName(){
        return username;
    }
    
    public void setUserName(String username){
        this.username = username;
    }
    
    public int getPasswordHash() {
    return passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    private int hashPassword(String password){ //made this private since it's being called in User
        return Objects.hash(password);
    }
    
    public boolean checkPassword(String password){
        return passwordHash == hashPassword(password);
    }
    
    public String toString(){
        return "Username: " + username +
                " /Email: " + email + 
                " /Phone number: " + phoneNumber;
    }
}