
package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
public class Paytm extends JFrame implements ActionListener{
    JButton b1;
    Paytm(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
        try {
            j.setPage("https://paytm.com");
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not Load, Error 404</html>");
        }
        JScrollPane js =new JScrollPane(j);
        getContentPane().add(js);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        b1 = new JButton("BACK");
        b1.setBounds(0,0,200,30);
        b1.addActionListener(this);
        j.add(b1);
    }
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==b1){
         this.setVisible(false);
         new Payment().setVisible(true);
     }   
    }
    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }
}
