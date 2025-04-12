package JavaSwing1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class deneme5 {

    public static void main(String[] args) {
        JFrame myframe = new JFrame("Password example.");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);
        JPasswordField password = new JPasswordField();
          
        JLabel label = new JLabel("Password :");
        label.setBackground(Color.red);
        label.setBounds(50, 100, 120, 30);
        password.setBounds(150, 100, 150, 30);
               
        myframe.setSize(550,550);
        myframe.add(label);
        myframe.add(password);
         
        myframe.setVisible(true);
    } 
}
