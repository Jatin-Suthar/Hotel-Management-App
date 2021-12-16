package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteCustomer extends JFrame implements ActionListener{
     JLabel l11,l12,l13,l14,l15,l16,l17,l18,l19,l21;
    JButton b1,b2;
    String username;
    DeleteCustomer(String username){
        this.username = username;
        setBounds(400,250,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l0 = new JLabel("DELETE CUSTOMER DETAILS");
        l0.setBounds(500,20,500,20);
        l0.setForeground(Color.DARK_GRAY);
        l0.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l0);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
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
        
        JLabel l2 = new JLabel("NAME: ");
        l2.setBounds(30,40,200,25);
        add(l2);
        
        l12 = new JLabel();
        l12.setBounds(240,40,200,25);
        add(l12);
        
        JLabel l3 = new JLabel("ID: ");
        l3.setBounds(30,70,200,25);
        add(l3);
        
        l13 = new JLabel();
        l13.setBounds(240,70,200,25);
        add(l13);
        
        JLabel l4 = new JLabel("NUMBER: ");
        l4.setBounds(30,100,200,25);
        add(l4);
        
        l14 = new JLabel();
        l14.setBounds(240,100,200,25);
        add(l14);
        
        JLabel l5 = new JLabel("GENDER: ");
        l5.setBounds(30,130,200,25);
        add(l5);
        
        l15 = new JLabel();
        l15.setBounds(240,130,200,25);
        add(l15);
        
        JLabel l6 = new JLabel("COUNTRY: ");
        l6.setBounds(30,160,200,25);
        add(l6);
        
        l16 = new JLabel();
        l16.setBounds(240,160,200,25);
        add(l16);
        
        JLabel l7 = new JLabel("ADDRESS: ");
        l7.setBounds(30,190,200,25);
        add(l7);
        
        l17 = new JLabel();
        l17.setBounds(240,190,200,25);
        add(l17);
        
        JLabel l8 = new JLabel("PHONE: ");
        l8.setBounds(30,220,200,25);
        add(l8);
        
        l18 = new JLabel();
        l18.setBounds(240,220,200,25);
        add(l18);
        
        JLabel l9 = new JLabel("EMAIL: ");
        l9.setBounds(30,250,200,25);
        add(l9);
        
        l19 = new JLabel();
        l19.setBounds(240,250,200,25);
        add(l19);
        
        
        b1 = new JButton("DELETE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,300,200,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,300,200,30);
        b2.addActionListener(this);
        add(b2);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"';");
            while (rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                
            }
            } catch (Exception e) {}
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b2){
            this.setVisible(false);
        }else if(ae.getSource() == b1){
            
            try {
                Conn c = new Conn();
                c.s.executeUpdate("delete from account where username = '"+username+"'");
                c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
                c.s.executeUpdate("delete from customer where username = '"+username+"'");
                
                 JOptionPane.showMessageDialog(null,"ACCOUNT DELETED");
                 System.exit(0);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
        new DeleteCustomer("").setVisible(true);
    }
}
