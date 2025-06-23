/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jlistexample;

import javax.swing.*;
/**
 *
 * @author YOGA
 */
public class JListExample {
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] cities = 
        {"istanbul","ankara","izmir","bursa","antalya"};
        
        JList<String> cityList = new JList<> (cities); 
        
        JScrollPane scrollPane = new JScrollPane(cityList);
        
        frame.add(scrollPane);  frame.setVisible(true);
    }
}