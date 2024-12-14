package com.daniel.registrationform;

import javax.swing.*;

public class RegistrationForm extends JFrame {
    private JPanel pnlRegistration;
    private JPanel pnlBottom;
    private JPanel pnlLeft;
    private JPanel pnlRight;
    private JTextField txtFirst;
    private JTextField txtLast;
    private JTextField txtEmail;
    private JButton btnRegister;
    private JPasswordField txtPass;

    public RegistrationForm() {
        super("Registration Form");
        this.setContentPane(pnlRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        btnRegister.addActionListener(e -> {
            String firstName = txtFirst.getText().trim();
            String lastName = txtLast.getText().trim();
            String email = txtEmail.getText().trim();
            String password = new String(txtPass.getPassword()).trim();

            if (firstName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required!", " Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            User newUser = new User(firstName, "", email, password);

            if (Users.getInstance().addUser(newUser)) {
                JOptionPane.showMessageDialog(null, "User registered successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Email is already in use!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            DisplayUsersForm displayUsersForm = new DisplayUsersForm();
            displayUsersForm.setVisible(true);

            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }
}
