/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeditorpaneornek;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author YOGA
 */
public class JEditorPaneOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JEditorPane Örneği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("""
                           <html><boddy>
                           <h1>Mehaba Dünya!</h1>
                           <p>Bu bir <b>JEditorPane</b> örneğidir. </p> 
                           <ul> <li> HTML görüntüleyebilir </li><li>  RTF destekler </li><li> Text te olur </li></ul>
                           </body></html>
        """);
        editorPane.setEditable(false);
        
        frame.add(new JScrollPane(editorPane));
        frame.setVisible(true);
    }
    
}
