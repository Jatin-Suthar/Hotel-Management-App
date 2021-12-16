package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener{
    JLabel l11,l12,l13,l14,l15,l16,l17;
    JButton b1;
    ViewPackage(String username){
        setBounds(400,250,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l0 = new JLabel("PACKAGE DETAILS");
        l0.setBounds(350,10,300,25);
        l0.setFont(new Font("TAHOMA",Font.BOLD,20));
        add(l0);
        
        JLabel l1 = new JLabel("USERNAME: ");
        l1.setBounds(30,50,120,25);
        add(l1);
        
        l11 = new JLabel();
        l11.setBounds(170,50,120,25);
        add(l11);
        
        JLabel l2 = new JLabel("PACKAGE: ");
        l2.setBounds(30,90,120,25);
        add(l2);
        
        l12 = new JLabel();
        l12.setBounds(170,90,120,25);
        add(l12);
        
        JLabel l3 = new JLabel("TOTAL PERSONS: ");
        l3.setBounds(30,130,120,25);
        add(l3);
        
        l13 = new JLabel();
        l13.setBounds(170,130,120,25);
        add(l13);
        
        JLabel l4 = new JLabel("ID: ");
        l4.setBounds(30,170,120,25);
        add(l4);
        
        l14 = new JLabel();
        l14.setBounds(170,170,120,25);
        add(l14);
        
        JLabel l5 = new JLabel("NUMBER: ");
        l5.setBounds(30,210,120,25);
        add(l5);
        
        l15 = new JLabel();
        l15.setBounds(170,210,120,25);
        add(l15);
        
        JLabel l6 = new JLabel("PHONE: ");
        l6.setBounds(30,250,120,25);
        add(l6);
        
        l16 = new JLabel();
        l16.setBounds(170,250,120,25);
        add(l16);
        
        JLabel l7 = new JLabel("PRICE: ");
        l7.setBounds(30,290,120,25);
        add(l7);
        
        l17 = new JLabel();
        l17.setBounds(170,290,120,25);
        add(l17);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookpackage where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                
            }
        } catch (Exception e) {
        }
        b1 = new JButton("BACK");
        b1.setBounds(100,320,200,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookeddetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(500,40,300,300);
        add(l8);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new ViewPackage("").setVisible(true);
    }
}
