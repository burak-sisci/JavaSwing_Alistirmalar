package JavaSwing1;

import java.awt.event.*;
import javax.swing.*;
import java.time.LocalTime;

public class deneme11 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password field");

        JLabel label = new JLabel();
        label.setBounds(20, 130, 250, 80);

        JLabel labelTime = new JLabel();
        labelTime.setBounds(20, 200, 250, 30);  

        JPasswordField field = new JPasswordField();
        field.setBounds(100, 75, 100, 25);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(20, 20, 80, 25);
        
        JLabel l2 = new JLabel("Password");
        l2.setBounds(20, 75, 80, 25);
        
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 100, 25);
        
        JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 25);
        
        f.add(field);
        f.add(l1);
        f.add(label);
        f.add(b);
        f.add(text);
        f.add(labelTime);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime currentTime = LocalTime.now();
                int hour = currentTime.getHour();
                int minute = currentTime.getMinute();

                String time = String.format("%02d:%02d", hour, minute);
                labelTime.setText("Zaman: " + time); 

                String data = "Username: " + text.getText();
                data += ", Password: " + new String(field.getPassword());
                label.setText(data);
            }
        });    
    }
   
}