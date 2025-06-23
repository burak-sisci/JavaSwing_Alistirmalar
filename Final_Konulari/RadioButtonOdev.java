package radiobuttonodev;

import javax.swing.*;

public class RadioButtonOdev {

    // Constructor içinde tüm işlemler
    RadioButtonOdev() {
        JFrame frame = new JFrame("JRadioButton Example");

        JRadioButton r1 = new JRadioButton("1. öğretim");
        JRadioButton r2 = new JRadioButton("2. öğretim");

        r1.setBounds(100, 50, 150, 30);
        r2.setBounds(100, 90, 150, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        // Buton tanımı
        JButton button = new JButton("Seçimi Göster");
        button.setBounds(100, 130, 150, 30);

        // Butona tıklanınca mesaj kutusu göster
        button.addActionListener(e -> {
            if (r1.isSelected()) {
                JOptionPane.showMessageDialog(frame, "1. öğretim seçildi.");
            } else if (r2.isSelected()) {
                JOptionPane.showMessageDialog(frame, "2. öğretim seçildi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Lütfen bir seçenek seçin.");
            }
        });

        frame.add(r1);
        frame.add(r2);
        frame.add(button);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // main sadece nesne oluşturur
    public static void main(String[] args) {
        new RadioButtonOdev();
    }
}