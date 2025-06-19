/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiobutton1;

import javax.swing.*;

/**
 *
 * @author YOGA
 */

public class RadioButton1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JRadioButton Example");
        
        JRadioButton r1 = new JRadioButton("1. öğretim");
        JRadioButton r2 = new JRadioButton("2. öğretim");
        
        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);
        
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        
        frame.add(r1);
        frame.add(r2);
        
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     
    }  
}

// ödev: buna bir buton ekle.  seçimine göre 1. öğretim-2. öğretim diye mesaj kutusu çıksın.