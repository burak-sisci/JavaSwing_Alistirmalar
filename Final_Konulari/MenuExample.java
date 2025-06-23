/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuexample;

import javax.swing.*;

/**
 *
 * @author YOGA
 */
public class MenuExample {
    public MenuExample() {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("Sub Menu");
        JMenuItem i1 = new JMenuItem("item 1");
        JMenuItem i2 = new JMenuItem("item 2");
        JMenuItem i3 = new JMenuItem("item 3");
        JMenuItem i4 = new JMenuItem("item 4");        
        JMenuItem i5 = new JMenuItem("item 5");

        menu.add(i1);   menu.add(i2);   menu.add(i3);   submenu.add(i4);    submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MenuExample();
    }
    
}
