package JavaSwing1;

import java.awt.Color;
import javax.swing.JFrame;

public class deneme2 {
    public static void main(String[] args) {
        new deneme2(); 
    }
    
    JFrame new_frame = new JFrame();

    public deneme2(){
       
        new_frame.setSize(500, 500);
        new_frame.getContentPane().setBackground(Color.GREEN);
        new_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new_frame.setVisible(true);
        
    }
}
    
