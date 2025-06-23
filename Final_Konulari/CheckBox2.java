/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaSwing1;

import javax.swing.*;

/**
 *
 * @author YOGA
 */
public class CheckBox2 {
    CheckBox2() {
        JFrame frame = new JFrame("CheckBox Example");   
        
        JCheckBox checkbox1 = new JCheckBox("No");
        checkbox1.setBounds(180,200,80,25);

        JCheckBox checkbox2 = new JCheckBox("Yes",true);
        checkbox2.setBounds(180,230,80,25);

        frame.add(checkbox1);
        frame.add(checkbox2);
        
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CheckBox2();
    }    
}
