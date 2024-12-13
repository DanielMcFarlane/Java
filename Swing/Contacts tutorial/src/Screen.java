import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Screen extends JFrame {
    private JPanel pnlMain;
    private JPanel pnlTop;
    private JPanel pnlLeft;
    private JPanel pnlRight;
    private JList lstPeople;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtPhoneNumber;
    private JTextField txtAddress;
    private JTextField txtDateOfBirth;
    private JLabel lblAge;
    private JButton btnSave;
    private JButton btnNew;
    private ArrayList<Person> people;
    private DefaultListModel listPeopleModel;

    Screen() {
        super("Contacts project");
        this.setContentPane(this.pnlMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        AbstractButton listPeople;
        lstPeople.setModel(listPeopleModel);
        btnSave.setEnabled(false);

        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person(
                        txtName.getText(),
                        txtEmail.getText(),
                        txtPhoneNumber.getText(),
                        txtDateOfBirth.getText()
                );

                people.add(p);
                refreshPeopleList();
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personNumber = lstPeople.getSelectedIndex();
                if (personNumber >= 0) {
                    Person p = people.get(personNumber);
                    p.setName(txtName.getText());
                    p.setEmail(txtEmail.getText());
                    p.setPhoneNumber(txtPhoneNumber.getText());
                    p.setDateOfBirth(txtDateOfBirth.getText());

                    refreshPeopleList();
                }
            }
        });

        lstPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int personNumber = lstPeople.getAnchorSelectionIndex();
                if (personNumber >= 0) {
                    Person p = people.get(personNumber);
                    txtName.setText(p.getName());
                    txtEmail.setText(p.getEmail());
                    txtPhoneNumber.setText(p.getPhoneNumber());
                    txtDateOfBirth.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    lblAge.setText(Integer.toString(p.getAge()) + " years");
                    btnSave.setEnabled(true);
                } else {
                    btnSave.setEnabled(false);
                }
            }
        });
    }

    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Removing all people from list");

        for (Person p : people) {
            System.out.println("Adding person to list: " + p.getName());
            listPeopleModel.addElement(p.getName());
        }
    }

    public void addPerson(Person p) {
        people.add(p);
        refreshPeopleList();
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setSize(500,350);
        screen.setVisible(true);

        Person sheldon = new Person("Sheldon Lee Cooper", "sheldon@gmail.com", "555 0001", "26/02/1980");
        Person howard = new Person("Howard Joel Wolowitz", "howard@gmail.com", "555 0002", "01/03/1981");
        Person bernadette = new Person("Bernadette Rostenkowski-Wolowitz", "bernadette@gmail.com", "555 0002", "01/01/1984");
        Person raj = new Person("Rajesh Ramayan Koothrappali", "raj@gmail.com", "555 0003", "06/10/1981");
        Person penny = new Person("Penny Hofstadter", "penny@gmail.com", "555 0004", "02/12/1985");
        Person leonard = new Person("Leonard Hofstadter", "leonard@gmail.com", "555 0004", "17/05/1980");
        Person amy = new Person("Amy Farrah Fowler", "amy@gmail.com", "555 0005", "17/12/1979");

        screen.addPerson(sheldon);
        screen.addPerson(howard);
        screen.addPerson(bernadette);
        screen.addPerson(raj);
        screen.addPerson(penny);
        screen.addPerson(leonard);
        screen.addPerson(amy);
    }
}