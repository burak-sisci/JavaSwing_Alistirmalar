package JavaSwing1;

import javax.swing.*;
import java.awt.*;


public class deneme1 {
    public static void main(String[] args) {
        
        JFrame myFrame = new JFrame();
        JButton button = new JButton("Click");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextField myText = new JTextField();
        myText.setBounds(200,100,100,50);
        myText.setBackground(Color.green);
        button.setBounds(200, 200, 100, 50);
        myFrame.add(button);
        
        button.addActionListener(event -> {
            myText.setText("You clicked it.");
        });
              
        myFrame.setSize(600, 600);
        myFrame.setLayout(null);
       
        myFrame.add(myText);
  
        myFrame.setVisible(true);
        
        
    }
}