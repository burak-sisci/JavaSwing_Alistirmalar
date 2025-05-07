package JavaSwing1;

import javax.swing.*;
import java.awt.FlowLayout;

public class ComboBox1 {
    JFrame f;
    ComboBox1() {
        f = new JFrame("ComboBox1");
        String lectures [] = {"Programlama 2",
        "Programlama 1",
        "Ayrık Matematik",
        "Kalkülüs 2",
        "Veri Yapıları",
        "Veri Madenciliği"
    };
    JComboBox cb = new JComboBox(lectures);
    cb.setBounds(50,40,70,70);
    f.add(cb);
    f.setLayout(new FlowLayout());
    f.setSize(200,200);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    public static void main(String[] args) {
        new ComboBox1();
    }
}
