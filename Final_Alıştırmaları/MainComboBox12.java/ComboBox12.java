/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combobox12;

import javax.swing.*;
import java.awt.FlowLayout;

/**
 *
 * @author YOGA
 */
public class ComboBox12 {
    JFrame f;
    ComboBox12(){
        f = new JFrame("ComboBox1");
        String lectures [] = {"Prog 2","Web Application","Data Structers","English","Data Science"};
        JComboBox cb = new JComboBox(lectures);
        cb.setBounds(450, 440, 70, 70); //FlowLayout olduğu için gereksizdir. 
        f.add(cb);
        f.setLayout(new FlowLayout()); 
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l = new JLabel("Tıklama");
        l.setBounds(100, 100, 50, 50);
        JButton b = new JButton("tıklat");
        b.setBounds(100,50,30,30);
        f.add(b);
        f.add(cb);
        f.add(l);
        
        b.addActionListener(event -> { 
            if(cb.isEnabled()) {
                String selection = (String) cb.getSelectedItem();
                l.setText(selection);
            }
        });
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ComboBox12();
    }
}
// new JLabel("",JLAbel.CENTER); kotrol et. 
// SelectedItem ne demek bak. 
// ÖDEV: 
//Polymorphism tekrar araştır. 
//Inheritance tekrar araştır. 