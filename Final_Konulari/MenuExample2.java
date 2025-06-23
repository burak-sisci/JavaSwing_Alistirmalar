/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuexample2;

import javax.swing.*;

/**
 *
 * @author YOGA
 */
public class MenuExample2 {
    public MenuExample2() {
        JFrame f = new JFrame("NotePad Örneği");
        JMenuBar mb = new JMenuBar();
        //MENÜLER
        JMenu menu1 = new JMenu("dosya");
        JMenu menu2 = new JMenu("düzenle");
        JMenu menu3 = new JMenu("görünüm");
        
        //ALT MENÜLER
        JMenu submenu1 = new JMenu("en son");
        JMenuItem i11 = new JMenuItem("yeni sekme");
        JMenuItem i12 = new JMenuItem("yeni pencere");
        JMenuItem i13 = new JMenuItem("aç");
        JMenuItem i14 = new JMenuItem("not 1");        
        JMenuItem i15 = new JMenuItem("not 2");

        JMenu submenu2 = new JMenu("yazı düzen");
        JMenuItem i21 = new JMenuItem("kes");
        JMenuItem i22 = new JMenuItem("kopyala");
        JMenuItem i23 = new JMenuItem("yapıştır");
        JMenuItem i24 = new JMenuItem("italik");        
        JMenuItem i25 = new JMenuItem("kalınlaştır");

        JMenu submenu3 = new JMenu("görünüüm");
        JMenuItem i31 = new JMenuItem("durum çubuğu");
        JMenuItem i32 = new JMenuItem("sözlük kaydır");
        JMenuItem i33 = new JMenuItem("yakınlaştır");
        JMenuItem i34 = new JMenuItem("uzaklaştır");        
        JMenuItem i35 = new JMenuItem("varsayılana getir");
        
        menu1.add(i11);   menu1.add(i12);   menu1.add(i13);   submenu1.add(i14);    submenu1.add(i15);
        menu1.add(submenu1);
                
        menu2.add(i21);   menu2.add(i22);   menu2.add(i23);   submenu2.add(i24);    submenu2.add(i25);
        menu2.add(submenu2);
                
        menu3.add(i31);   menu3.add(i32);   submenu3.add(i33);   submenu3.add(i34);    submenu3.add(i35);
        menu3.add(submenu3);
          
        mb.add(menu1);  mb.add(menu2);  mb.add(menu3);  
                

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
        new MenuExample2();
    }
}    
    //ödev: actionlistener ın içindeki (this) ne işe yarar?

    /* this, bulunduğu yerin sınıf örneğini (nesnesini) temsil eder. 
    Ancak ActionListener gibi bir iç sınıf (anonymous class) içinde kullanıldığında this, 
    o iç sınıfı ifade eder — yani artık senin dıştaki sınıfını değil. */


    //ödev2: menubar kullamadan menu gösterilir mi? 

    /* Java Swing’de menüler genellikle JMenuBar ile birlikte kullanılır 
    ama JPopupMenu sınıfı sayesinde menü çubuğu (menubar) kullanmadan da bir menü oluşturup göstermek mümkündür. */

