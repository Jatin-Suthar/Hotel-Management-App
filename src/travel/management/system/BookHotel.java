package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class BookHotel extends JFrame implements ActionListener {
    JLabel l11,l12,l13,l14,l15;
    Choice c1,c2,c3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    BookHotel(String username){
        setBounds(400,250,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l0 = new JLabel("BOOK HOTEL");
        l0.setBounds(600,10,200,30);
        l0.setForeground(Color.DARK_GRAY);
        l0.setFont(new Font("Tahoma",Font.BOLD,30));
        add(l0);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l20 = new JLabel(i3);
        l20.setBounds(550,50,300,300);
        add(l20); 
        
        JLabel l1 = new JLabel("USERNAME: ");
        l1.setBounds(30,10,200,25);
        add(l1);
        
        l11 = new JLabel();
        l11.setBounds(240,10,200,25);
        add(l11);
        
        JLabel l2 = new JLabel("SELECT HOTEL: ");
        l2.setBounds(30,40,200,25);
        add(l2);
        
        c1 = new Choice();
        c1.setBounds(240,40,200,25);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotels");
            while (rs.next()){
                c1.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
         c1.setBounds(240,40,200,25);
        add(c1);
        
        JLabel l3 = new JLabel("TOTAL PERSONS: ");
        l3.setBounds(30,70,200,25);
        add(l3);
        
        t1 = new JTextField("1");
        t1.setBounds(240,70,200,25);
        add(t1);
        
        JLabel l4 = new JLabel("NO OF DAYS: ");
        l4.setBounds(30,100,200,25);
        add(l4);
        
        t2 = new JTextField("1");
        t2.setBounds(240,100,200,25);
        add(t2);
        
        JLabel l5 = new JLabel("AC/NON-AC: ");
        l5.setBounds(30,130,200,25);
        add(l5);
        
        c2 = new Choice();
        c2.add("AC");
        c2.add("NON AC");
        c2.setBounds(240,130,200,25);
        add(c2);
        
        JLabel l6 = new JLabel("FOOD INCLUDED: ");
        l6.setBounds(30,160,200,25);
        add(l6);
        
        c3 = new Choice();
        c3.add("YES");
        c3.add("NO");
        c3.setBounds(240,160,200,25);
        add(c3);
        
        JLabel l7 = new JLabel("ID: ");
        l7.setBounds(30,190,200,25);
        add(l7);
        
        l12 = new JLabel();
        l12.setBounds(240,190,200,25);
        add(l12);
        
        JLabel l8 = new JLabel("NUMBER: ");
        l8.setBounds(30,220,200,25);
        add(l8);
        
        l13 = new JLabel();
        l13.setBounds(240,220,200,25);
        add(l13);
        
        JLabel l9 = new JLabel("PHONE: ");
        l9.setBounds(30,250,200,25);
        add(l9);
        
        l14 = new JLabel();
        l14.setBounds(240,250,200,25);
        add(l14);
        
        JLabel l10 = new JLabel("TOTAL PRICE: ");
        l10.setBounds(30,280,200,25);
        add(l10);
        
        l15 = new JLabel();
        l15.setBounds(240,280,200,25);
        l15.setForeground(Color.RED);
        add(l15);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"';");
            while (rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(8));
                
            }
            } catch (Exception e) {}
        
        b1 = new JButton("CHECK PRICE");
        b1.setBounds(40,310,150,30);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2 = new JButton("BOOK HOTEL");
        b2.setBounds(200,310,150,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("BACK");
        b3.setBounds(360,310,150,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            int cost1 = 0;
            int cost2=0;
            int cost3=0;
            int total = 0;
            try {
                Conn c = new Conn();
                ResultSet rs  = c.s.executeQuery("select * from hotels where name = '"+c1.getSelectedItem()+"'");
                while(rs.next()){
                   
                    cost1 = Integer.parseInt(rs.getString(2)) * Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText()) ;
                    
                    cost2 = c2.getSelectedItem().equals("AC") ? (Integer.parseInt(rs.getString(4))* Integer.parseInt(t2.getText())) :0;
                    
                    cost3 = c3.getSelectedItem().equals("YES") ? (Integer.parseInt(rs.getString(3)) * Integer.parseInt(t2.getText()) * Integer.parseInt(t1.getText())) :0;
                    
                    total = cost1+cost2+cost3;
                    
                    l15.setText("Rs "+total);
                }
            }catch (Exception e) {}
            
        }else if(ae.getSource() == b2){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
                JOptionPane.showMessageDialog(null, "HOTEL BOOKED SUCCESSFULLY");
                this.setVisible(false);
                
            }catch(Exception e ){}
            
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            
        }
    }
    
    
    public static void main(String[] args) {
        new BookHotel("").setVisible(true);
    }
    
}
