package JavaSwing1;

import javax.swing.*;
import java.awt.event.*;

    public class deneme7 implements ActionListener{
        JLabel l1,l2;
        JTextArea area;
        JButton b; 
        
        public deneme7(){
            JFrame f = new JFrame(); 
            
            l1 = new JLabel();
            l1.setBounds(120,75,100,30);
            
            l2 = new JLabel(); 
            l2.setBounds(200,75,100,30);
            
            area = new JTextArea();
            area.setBounds(130,100,200,200); 
            
            b = new JButton("Count Words"); 
            b.setBounds(165,300,120,30);
            b.addActionListener(this);
            
            f.add(l1); f.add(l2); f.add(area); f.add(b); 
            f.setSize(450,450);
            f.setLayout(null);
            f.setVisible(true); 
        }
        
    public static void main(String[] args) {
        new deneme7(); 
    }  

    public void actionPerformed(ActionEvent e) {
        String text = area.getText(); 
        String words[] = text.split("\\s+");
        l1.setText("Words: "+words.length); 
        l2.setText("Characters: "+text.length()); 
    }
}