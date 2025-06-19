/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiobutton2odev;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author YOGA
 */
public class RadioButton2odev {

    public static void main(String[] args) {
        // Ana pencere oluşturuluyor
        JFrame frame = new JFrame("JRadioButton Example");

        // Radio butonları oluşturuluyor
        JRadioButton r1 = new JRadioButton("1. öğretim");
        JRadioButton r2 = new JRadioButton("2. öğretim");

        // Konumlandırma
        r1.setBounds(100, 50, 150, 30);
        r2.setBounds(100, 80, 150, 30);

        // Sadece bir radio butonun seçilmesi için gruplama
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        // Seçimi gösterecek buton
        JButton button = new JButton("Seçimi Göster");
        button.setBounds(100, 120, 150, 30);

        // Seçimi gösterecek etiket (label)
        JLabel label = new JLabel("Henüz bir seçim yapılmadı.");
        label.setBounds(100, 160, 250, 30);

        // Buton tıklama olayı
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    label.setText("1. öğretim seçildi.");
                } else if (r2.isSelected()) {
                    label.setText("2. öğretim seçildi.");
                } else {
                    label.setText("Lütfen bir seçim yapınız.");
                }
            }
        });

        // Bileşenleri pencereye ekleme
        frame.add(r1);
        frame.add(r2);
        frame.add(button);
        frame.add(label);

        // Pencere ayarları
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}