package JavaSwing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class deneme8 implements  ActionListener{

    String real_password = "abc";
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JButton button = new JButton("Check");
    
    JPasswordField mypassword = new JPasswordField();
    JTextArea textArea = new JTextArea();
    
    public deneme8(){
        JFrame myframe = new JFrame();
        myframe.setTitle("Password Checking");

        l1.setBounds(50, 20, 100, 30);
        l1.setOpaque(true);
        l1.setText("Please");

        l2.setBounds(50, 50, 300, 30);
        l2.setOpaque(true);
        l2.setText("Enter password");
 

        mypassword.setBounds(50, 100, 200, 30);
        textArea.setBounds(50, 150, 200, 30);

        button.setBounds(50, 200, 100, 30);
        button.addActionListener(this);

        myframe.add(l1);
        myframe.add(l2);
        myframe.add(mypassword);
        myframe.add(textArea);
        myframe.add(button);

        myframe.setLayout(null);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(450, 450);
        myframe.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new deneme8();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String checkpassword = new String(mypassword.getPassword());
        
        if(checkpassword.equals(real_password)){
            System.out.println("Şifre doğru ! ");
            textArea.setText("Tebrikler!!");
            
        }else{
            System.out.println("Şifre yanlış !");
            textArea.setText("Bir daha deneyin");
        }
    }
    
}