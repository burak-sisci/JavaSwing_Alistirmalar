package JavaSwing1;

import javax.swing.*;   
import java.awt.FlowLayout;
import java.awt.*;


public class CheckBox1 {
    CheckBox1() {
        JFrame frame = new JFrame("Sipariş Kutusu");

        JCheckBox checkBox1 = new JCheckBox("Çay"); 
        frame.add(checkBox1);
        JCheckBox checkBox2 = new JCheckBox("Kahve");   
        frame.add(checkBox2);
        JCheckBox checkBox3 = new JCheckBox("Limonata");
        frame.add(checkBox3);
        JCheckBox checkBox4 = new JCheckBox("Meyve Suyu");
        frame.add(checkBox4);
        JButton button = new JButton("Siparişi Göster");
        frame.add(button);
        JLabel label = new JLabel("Siparişiniz");
        frame.add(label);

        button.addActionListener(e -> {
            String siparis = "siparişiniz: ";
            boolean secimVar = false;

            if (checkBox1.isSelected()) {
                siparis += " çay ";   secimVar = true;
            }if (checkBox2.isSelected()) {
                siparis += " kahve ";   secimVar = true;
            }if (checkBox3.isSelected()) {
                siparis += " limonata ";   secimVar = true;
            }if (checkBox4.isSelected()) {
                siparis += " meyve suyu ";   secimVar = true;
            }if (secimVar == false)
                siparis += "sipariş girin. ";
            label.setText(siparis);
        });

        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    

    }
    public static void main(String[] args) {
        new CheckBox1();
    }
}