package com.daniel.registrationform;

import javax.swing.*;

public class HomePage extends JFrame {
    private JPanel pnlHomePage;
    private JButton btnLogout;
    private JLabel lblWelcome;

    HomePage(User user) {
        super("Home Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 350);

        lblWelcome.setText("Welcome, " + user.getFirstName() + "!");

        btnLogout.addActionListener(e -> {
            dispose();
            new LoginForm().setVisible(true);
        });

        this.add(pnlHomePage);
        this.setVisible(true);
    }
}
