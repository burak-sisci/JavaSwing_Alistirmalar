/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combobox1;

import javax.swing.*;
import java.awt.FlowLayout;

/**
 *
 * @author YOGA
 */
public class ComboBox1 {
    JFrame f;
    ComboBox1(){
        f = new JFrame("ComboBox1");
        String lectures [] = {"Prog 2","Web Application","Data Structers","English","Data Science"};
        JComboBox cb = new JComboBox(lectures);
        cb.setBounds(50, 40, 70, 70);
        f.add(cb);
        f.setLayout(new FlowLayout());
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ComboBox1();
    }
    
}
