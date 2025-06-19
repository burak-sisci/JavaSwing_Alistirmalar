/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author YOGA
 */
public class HesapMakinesi3 extends JFrame{
    
    private final JTextField ekran;
    private String islem = "";
    private double oncekiSayi = 0;
    
    public HesapMakinesi3() {
        setTitle("Hesap Makinesi");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        ekran = new JTextField();
        ekran.setFont(new Font("Arial",Font.BOLD,24));
        ekran.setHorizontalAlignment(JTextField.RIGHT);
        ekran.setEditable(false);
        add(ekran, BorderLayout.NORTH);
        
        JPanel tusPaneli = new JPanel(new GridLayout(4,4,5,5));
        
        String[] tuslar = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "C","0","=","+"
        };
        
        for (String yazi : tuslar) {
            JButton btn = new JButton(yazi);
            btn.setFont(new Font("Arial",Font.BOLD,18));
            tusPaneli.add(btn);
            btn.addActionListener(new ActionListener() {
                @Override 
                public void actionPerformed(ActionEvent e) {
                    tusTiklandi(btn.getText());
                }
            });
            
        }
        add(tusPaneli,BorderLayout.CENTER);
        setVisible(true);
       
    }
    private void tusTiklandi(String tus) {
        if (tus.matches("[0-9]")) {
            ekran.setText(ekran.getText()+tus);
        }else if (tus.matches("[+\\-*/]")) {
            oncekiSayi = Double.parseDouble(ekran.getText());
            islem = tus;
            ekran.setText(ekran.getText()+tus);
        }else if (tus.equals("=")) {
            double ikinciSayi = Double.parseDouble(ekran.getText()+tus);
            double sonuc = 0;
            
            switch (islem) {
                case "+" -> sonuc = oncekiSayi + ikinciSayi;
                case "-" -> sonuc = oncekiSayi - ikinciSayi;
                case "*" -> sonuc = oncekiSayi * ikinciSayi;
                case "/" -> sonuc = oncekiSayi / ikinciSayi;
            }
            
            ekran.setText(String.valueOf(sonuc));
            islem = "";
        }else if (tus.equals("C")) {
            ekran.setText("");
            oncekiSayi = 0;
            islem = "";
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HesapMakinesi3();
    }
    
}// ödev: bunu tamamla. işlemler yapıldığında tam görünmeli.
