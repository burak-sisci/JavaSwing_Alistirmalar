package JavaSwing1;

import javax.swing.*;

public class RadioButton1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");

        JRadioButton rb1 = new  JRadioButton("1. öğretim");
        JRadioButton rb2 = new JRadioButton("2. öğretim");

        rb1.setBounds(100,50,100,30);
        rb2.setBounds(100,100,100,30);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(rb1);
        group1.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
