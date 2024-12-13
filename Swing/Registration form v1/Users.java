import java.util.ArrayList;

public class Users {
    private static Users instance;
    private ArrayList<User> users;

    public Users() {
        users = new ArrayList<>();
    }
    
    public static Users getInstance(){
        if (instance == null){
            instance = new Users();
        }
        return instance;
    }
    
    public boolean addUser(User user){
        if (!isEmailUnique(user.getEmail())){
            return false;
        }
        users.add(user);
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for (User user : users){
            if (user.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }

    public ArrayList<User> getUserList(){
        return users;
    }
    
    // public boolean addUser(User user) {
        // if (!isEmailUnique(user.getEmail())) {
            // System.out.println("Email already in use.");
            // return false;
        // }
        // if (!isPasswordStrong(user.getPassword())) {
            // System.out.println("Password is not strong enough.");
            // return false;
        // }
        // users.add(user);
        // return true;
    // }

    // private boolean isEmailUnique(String email) {
        // for (User user : users) {
            // if (user.getEmail().equals(email)) {
                // return false;
            // }
        // }
        // return true;
    // }

    private boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}
