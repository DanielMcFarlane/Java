
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String phone;
    private String password;

    /**
     * Constructor for objects of class User
     */
    public User(String name, String email, String phone, String password)
    {
        // initialise instance variables
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        
    }
    
    public User()
    {
        // initialise instance variables
        this.name = "Daniel";
        this.email = "daniel@daniel.com";
        this.phone = "0123456789";
        this.password = "password";
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
    
    public void showDetails(){
        System.out.println("Name: " + name + 
                            "\nEmail: " + email + 
                                "\nPhone: " + phone);
    }
}
