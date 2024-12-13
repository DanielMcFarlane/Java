import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class Frame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frame
{
   public static void main(String[] args){
       JFrame fr = new JFrame("Frame test");
       
       JLabel lblName = new JLabel("Name: ");
       JTextField txtName = new JTextField();
       JButton btnClick = new JButton("Enter");
       
       lblName.setBounds(30, 50, 100, 25);
       txtName.setBounds(100, 50, 100, 30);
       btnClick.setBounds(100, 100, 100, 30);
       
       btnClick.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           String name = txtName.getText();
           
           JOptionPane.showMessageDialog(fr, "Hello, " + name);
        }
       });
       
       fr.add(lblName);
       fr.add(txtName);
       fr.add(btnClick);
       fr.setSize(300,250);
       fr.setLayout(null);
       fr.setVisible(true);
   }
}
