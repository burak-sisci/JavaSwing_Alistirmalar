package JavaSwing1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class deneme4 extends JFrame implements ActionListener {
    
    private final JTextField tf;
    private final JLabel l; 
    private final JButton b;
    
    public deneme4(){
        super("IP Finder");
        
        tf = new JTextField("Enter a domain (e.g. google.com)", 20);
        tf.setForeground(Color.GRAY);
        tf.setBounds(50, 50, 250, 30);
        
        l = new JLabel("Result will be displayed here.");
        l.setBounds(50, 100, 300, 30);
        
        b = new JButton("Find IP");
        b.setBounds(50, 150, 120, 40);
        b.addActionListener(this);
        
        setLayout(null);
        add(tf);
        add(b);
        add(l);
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText().trim();
            if(host.isEmpty() || host.equalsIgnoreCase("Enter a domain (e.g. google.com)")){
                JOptionPane.showMessageDialog(this, "Please enter a valid domain name", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (UnknownHostException ex) { 
            JOptionPane.showMessageDialog(this, "Invalid domain or internet connection error.");
        }
    }
    public static void main(String[] args) {
        new deneme4();
    }
}
