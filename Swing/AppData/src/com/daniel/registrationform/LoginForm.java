package com.daniel.registrationform;

import javax.swing.*;

public class LoginForm extends JFrame {
    private JPanel pnlLoginForm;
    private JPanel pnlBottom;
    private JPanel pblRight;
    private JPanel pnlLeft;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    LoginForm() {
        super("Login Page");
        this.setContentPane(this.pnlLoginForm);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setSize(350, 350);

        btnLogin.addActionListener(e -> {
            String email = txtEmail.getText().trim();
            String password = new String(txtPassword.getPassword()).trim();

            if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            User userLoggedIn = null;

            for (User user : Users.getInstance().getUserList()) {
                if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
                    userLoggedIn = user;
                    break;
                }
            }

            if (userLoggedIn != null) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                HomePage homePage = new HomePage(userLoggedIn);
                homePage.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
