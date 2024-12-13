import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame
{
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    
    public LoginForm()
    {
        setTitle("Login Page");
        
        //Email
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 50, 100, 25);
        add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 50, 150, 25);
        add(txtEmail);
        
        //Password
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 100, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 100, 150, 25);
        add(txtPassword);
        
        // Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 100, 30);
        add(btnLogin);

        
        // btnLogin.addActionListener(new ActionListener(){
            // public void actionPerformed(ActionEvent e) {
        btnLogin.addActionListener(e ->{
                String email = txtEmail.getText().trim();
                String password = new String(txtPassword.getPassword()).trim();
                
                if (email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                User userLoggedIn = null;
                
                for (User user : Users.getInstance().getUserList()){
                    if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)){
                        userLoggedIn = user;
                        break;
                    }
                }
                
                if (userLoggedIn != null){
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    HomePage homePage = new HomePage(userLoggedIn);
                    homePage.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
        });
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
