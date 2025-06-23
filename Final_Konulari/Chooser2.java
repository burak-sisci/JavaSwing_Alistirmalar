package JavaSwing1;

import javax.swing.*;
/**
 *
 * @author YOGA
 */
public class Chooser2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFileChooser fc = new JFileChooser("c:");
        fc.showSaveDialog(null);
    }
}