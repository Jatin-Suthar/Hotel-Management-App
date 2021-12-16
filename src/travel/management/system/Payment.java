package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener {
    JButton b1,b2;
    Payment(){
        setBounds(400,250,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,900,400);
        add(l1);
        
        b1 = new JButton("PAY");
        b1.setBounds(650,10,200,40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(30,10,200,40);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        l1.add(b2);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new Paytm().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Payment().setVisible(true);
    }
    
}
