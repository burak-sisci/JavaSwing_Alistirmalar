package JavaSwing1;

import javax.swing.*;
public class deneme3 {

    deneme3(){
        JFrame f = new JFrame(); 
        JTextArea area = new JTextArea("This is a TextArea: "); 
        area.setBounds(20,40,300,300);
        f.add(area); 
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true); 
    }
    public static void main(String args[]){
        new deneme3(); 
    }
}
