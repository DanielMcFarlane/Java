import javax.swing.*;

public class HomePage extends JFrame{
    public HomePage(User user){
        setTitle("Home Page");

        //Welcome
        JLabel lblWelcome = new JLabel("Welcome, " + user.getFirstName() + "!");
        lblWelcome.setBounds(150, 100, 300, 25);
        add(lblWelcome);

        //Button
        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(150, 150, 100, 30);
        add(btnLogout);

        btnLogout.addActionListener(e ->{
            dispose();
            new LoginForm();
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
