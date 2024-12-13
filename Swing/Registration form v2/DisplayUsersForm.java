import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayUsersForm extends JFrame
{
    public DisplayUsersForm(){
        setTitle("Regisgtered Users");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        ArrayList<User> users = Users.getInstance().getUserList();
        
        JTextArea userTextArea = new JTextArea();
        for (User user : users){
            userTextArea.append(user.getEmail() + "\n");
        }
        
        add(new JScrollPane(userTextArea), BorderLayout.CENTER);
                
        setVisible(true);
    }
}
