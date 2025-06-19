package JavaSwing1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author YOGA
 */
public class CheckBox3 { //kutunun seçildiğine dair altyazı çıkaran kod.
    public static class CheckBox_3{
        JLabel label = new JLabel();
        
        public CheckBox_3(){
            JFrame myframe = new JFrame();
            JCheckBox box1 = new JCheckBox("Box");
            box1.setBounds(180, 200, 80, 20);
            
            label.setBounds(140, 150, 20, 20);
            
            box1.addActionListener(event -> {
                if(box1.isSelected()){
                    label.setText("Seçildi");
                }else {
                    label.setText("Seçilmedi");
                }
            
            });
            
            myframe.add(box1);
            myframe.add(label);
            myframe.setVisible(true);
            myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myframe.setSize(500,500);
            
    }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CheckBox_3();
    }
    
}
