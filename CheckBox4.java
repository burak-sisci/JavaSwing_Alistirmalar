package JavaSwing1;

import javax.swing.*;

public class CheckBox4 {
    CheckBox4() {
        JFrame frame = new JFrame("CheckBox4");

        JLabel label = new JLabel("Lütfen bir seçim yapın");
        label.setHorizontalAlignment(JLabel.CENTER); 
        label.setBounds(40, 20, 300, 30);

        JCheckBox checkbox1 = new JCheckBox("No");
        checkbox1.setBounds(160, 100, 80, 25);

        JCheckBox checkbox2 = new JCheckBox("Yes");
        checkbox2.setBounds(160, 130, 80, 25);

        // Bileşenleri frame'e ekle
        frame.add(label);
        frame.add(checkbox1);
        frame.add(checkbox2);

        // Frame ayarları
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox4();
    }
}
