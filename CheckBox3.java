package JavaSwing1;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox3 {
    public static class CheckBox_3 {
        JLabel label = new JLabel();
        
        CheckBox_3() {
            JFrame myframe = new JFrame();
            JCheckBox box1 = new JCheckBox("Box");
            box1.setBounds(180,200,80,20);

            label.setBounds(140,150,20,20);

            box1.addActionListener(event -> {
                if(box1.isSelected()){
                    label.setText("seçildi");
                }else{
                    label.setText("seçilmedi");
                }
            });
            myframe.add(box1);
            myframe.add(label);
            myframe.setVisible(true);
            myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myframe.setSize(500, 500);
        }
    }
    public static void main(String[] args) {
        new CheckBox_3();
    }
}
