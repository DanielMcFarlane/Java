package com.daniel.registrationform;

import java.util.ArrayList;

public class Users {
    private static Users instance;
    private ArrayList<User> users;

    private Users() {

    }


    public static Users getInstance(){
        if (instance == null){
            instance = new Users();
        }
        return instance;
    }

    public boolean addUser(User user) {
        if (!isEmailUnique(user.getEmail())) {
            return false;
        }
        AppData.getInstance().getUsers().add(user);
        AppData.getInstance().saveData();
        return true;
    }

    public boolean isEmailUnique(String email) {
        for (User user : AppData.getInstance().getUsers()) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<User> getUserList() {
        return AppData.getInstance().getUsers();
    }

    private boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}