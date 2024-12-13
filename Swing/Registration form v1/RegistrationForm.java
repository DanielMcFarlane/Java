import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame
{
    private JTextField txtFirst, txtLast, txtEmail;
    private JPasswordField txtPass;
    private JButton btnRegister;
    private Users users;
    
    public RegistrationForm(){
        setTitle("Registration Form");

        //Labels
        JLabel lblFirst = new JLabel("First Name: ");
        lblFirst.setBounds(50, 50, 100, 25);
        add(lblFirst);
        
        JLabel lblLast = new JLabel("Last Name: ");
        lblLast.setBounds(50, 100, 100, 25);
        add(lblLast);
        
        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(50, 150, 100, 25);
        add(lblEmail);
        
        JLabel lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(50, 200, 100, 25);
        add(lblPassword);
        
        
        //TextBoxes
        txtFirst = new JTextField();
        txtFirst.setBounds(150, 50, 150,25);
        add(txtFirst);
        
        txtLast = new JTextField();
        txtLast.setBounds(150, 100, 150,25);
        add(txtLast);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 150, 150,25);
        add(txtEmail);
        
        txtPass = new JPasswordField();
        txtPass.setBounds(150, 200, 150,25);
        add(txtPass);
        
        //Button
        btnRegister = new JButton("Register");
        btnRegister.setBounds(150, 250, 100, 30);
        add(btnRegister);
        
        btnRegister.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String firstName = txtFirst.getText();
                String lastName = txtLast.getText();
                String email = txtEmail.getText();
                String password = new String(txtPass.getPassword());
                
                // JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nLast Name: " + lastName + "\nEmail: " + email);
                                                
                // if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty())
                // {
                    // JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                // }

                // User newUser = new User(firstName, lastName, email, password);
                // if (users.addUser(newUser)){
                    // JOptionPane.showMessageDialog(null, "User registered successfully!");
                // }else{
                    // JOptionPane.showMessageDialog(null, "Error registering!", "Error", JOptionPane.ERROR_MESSAGE);
                // }
                
                if (firstName.isEmpty() || email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "All fields are required!", " Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                User newUser = new User(firstName, "", email, password);
                
                if (Users.getInstance().addUser(newUser)){
                    JOptionPane.showMessageDialog(null, "User registered successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "Email is already in use!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                DisplayUsersForm uf = new DisplayUsersForm();

            }
        });
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new RegistrationForm();
    }
}