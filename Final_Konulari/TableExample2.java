/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tableexample2;

import javax.swing.*;
/**
 *
 * @author YOGA
 */
public class TableExample2 {
    TableExample2() {
        JFrame frame = new JFrame(" Table");
        
        String data[][] = {
            {"1","Ahmet","50000"},
            {"2","John","55000"},
            {"2","Salih","70000"}
        };
        String column[] = {"No","Name","Salary"};
        JTable table = new JTable(data, column);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TableExample2();
    }
}