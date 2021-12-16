package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class BookPackage extends JFrame implements ActionListener {
    Choice c1;
    JLabel l11, l12,l13,l14,l15;
    JButton b1,b2 ,b3;
    JTextField t1;
    BookPackage(String username){
        setBounds(400,250,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("USERNAME : ");
        l1.setBounds(30,20,200,25);
        add(l1);
        
        l11 = new JLabel();
        l11.setBounds(270,20,200,25);
        add(l11);
        
        JLabel l2 = new JLabel("SELECT PACKAGE : ");
        l2.setBounds(30,60,200,25);
        add(l2);
        
        c1 = new Choice();
        c1.add("GOLD PACKAGE");
        c1.add("SILVER PACKAGE");
        c1.add("BRONZE PACKAGE");
        c1.setBounds(270,60,200,25);
        add(c1);
        
        JLabel l3 = new JLabel("TOTAL PERSONS : ");
        l3.setBounds(30,100,200,25);
        add(l3);
        
        t1 = new JTextField("1");
        t1.setBounds(270,100,200,25);
        add(t1);
        
        JLabel l4 = new JLabel("ID : ");
        l4.setBounds(30,140,200,25);
        add(l4);
        
        l12 = new JLabel();
        l12.setBounds(270,140,200,25);
        add(l12);
        
        JLabel l5 = new JLabel("NUMBER : ");
        l5.setBounds(30,180,200,25);
        add(l5);
        
        l13 = new JLabel();
        l13.setBounds(270,180,200,25);
        add(l13);
        
        JLabel l6 = new JLabel("PHONE : ");
        l6.setBounds(30,220,200,25);
        add(l6);
        
        l14 = new JLabel();
        l14.setBounds(270,220,200,25);
        add(l14);
       
        
        JLabel l7 = new JLabel("TOTAL PRICE : ");
        l7.setBounds(30,260,200,25);
        add(l7);
        
        l15 = new JLabel();
        l15.setBounds(270,260,200,25);
        l15.setForeground(Color.RED);
        add(l15);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id_type"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("phone"));
            }
            
        } catch (Exception e) {
        }
        
        b1 = new JButton("CHECK PRICE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(40,300,200,25);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("BOOK PACKAGE");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(280,300,200,25);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("BACK");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(520,300,200,25);
        b3.addActionListener(this);
        add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(450,20,400,250);
        add(l8);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            String p = c1.getSelectedItem();
            int cost = 0;
            if(p.equals("GOLD PACKAGE")){
                cost+=32000;
            }else if(p.equals("SILVER PACKAGE")){
                cost+=24000;
            }else if(p.equals("BRONZE PACKAGE")){
                cost+=12000;
            }
            cost*=Integer.parseInt(t1.getText());
            l15.setText("Rs. "+cost);
            
        }else if (ae.getSource() == b2){
            try {
                Conn c = new Conn();
                String query = "insert into bookPackage values('"+l11.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l12.getText()+"', '"+l13.getText()+"', '"+l14.getText()+"', '"+l15.getText()+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"PACKAGE BOOKED SUCCESSFULY");
                this.setVisible(false);
            } catch (Exception e) {
            }
            
        }else if (ae.getSource()==b3){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookPackage("").setVisible(true);
    }
    
}
