package com.daniel.registrationform;

import javax.swing.*;
import java.util.ArrayList;

public class DisplayUsersForm extends JFrame {
    private JPanel pnlDisplayUsers;
    private JTextArea txtUsers;

    DisplayUsersForm() {
        super("Registered Users");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 350);

        this.setContentPane(pnlDisplayUsers);
        txtUsers.setEditable(false);

        ArrayList<User> users = Users.getInstance().getUserList();
        for (User user : users) {
            txtUsers.append(user.getEmail() + "\n");
        }
    }
}
