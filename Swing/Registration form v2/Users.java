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


    private boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}
