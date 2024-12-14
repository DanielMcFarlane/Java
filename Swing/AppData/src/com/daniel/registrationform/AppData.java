package com.daniel.registrationform;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private static AppData instance;
    private ArrayList<User> users;
    private AppData() {
        users = new ArrayList<>();
        loadData();
    }

    public static AppData getInstance() {
        if (instance == null) {
            instance = new AppData();
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appdata.data"))) {
            users = (ArrayList<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existing data file found. Starting with an empty dataset.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appdata.data"))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }
}
