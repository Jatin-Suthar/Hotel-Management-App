package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener  {
    
    JButton b2;
    ViewCustomer(String username){
      
        setBounds(400,250,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //JLabel l0 = new JLabel("View CUSTOMER DETAILS");
        //l0.setFont(new Font ("Tahoma",Font.BOLD,20));
        //l0.setBounds(550,10,300,25);
        //add(l0);
        
        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(30,30,200,25);
        l1.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l1);
        
        JLabel l11 = new JLabel("");
        l11.setBounds(270,30,200,25);
        l11.setFont(new Font("Tahoma",Font.ITALIC,16));
        l11.setForeground(Color.GRAY);
        add(l11);
        
        JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30,70,200,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l2);
        
        JLabel l12 = new JLabel("");
        l12.setBounds(270,70,200,25);
         l12.setFont(new Font("Tahoma",Font.ITALIC,16));
        l12.setForeground(Color.GRAY);
        add(l12);
        
        JLabel l3 = new JLabel("Number : ");
        l3.setBounds(30,110,200,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l3);
        
        JLabel l13 = new JLabel("");
        l13.setBounds(270,110,200,25);
         l13.setFont(new Font("Tahoma",Font.ITALIC,16));
        l13.setForeground(Color.GRAY);
        add(l13);
        
        JLabel l4 = new JLabel("Name : ");
        l4.setBounds(30,150,200,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l4);
        
        JLabel l14 = new JLabel("");
        l14.setBounds(270,150,200,25);
         l14.setFont(new Font("Tahoma",Font.ITALIC,16));
        l14.setForeground(Color.GRAY);
        add(l14);
        
        JLabel l5 = new JLabel("Gender : ");
        l5.setBounds(30,190,200,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l5);
        
        JLabel l15 = new JLabel("");
        l15.setBounds(270,190,200,25);
         l15.setFont(new Font("Tahoma",Font.ITALIC,16));
        l15.setForeground(Color.GRAY);
        add(l15);
        
        JLabel l6 = new JLabel("Country : ");
        l6.setBounds(520,30,200,25);
        l6.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l6);
        
        JLabel l16 = new JLabel("");
        l16.setBounds(760,30,200,25);
         l16.setFont(new Font("Tahoma",Font.ITALIC,16));
        l16.setForeground(Color.GRAY);
        add(l16);
        
        JLabel l7 = new JLabel("Address : ");
        l7.setBounds(520,70,200,25);
        l7.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l7);
        
        JLabel l17 = new JLabel("");
        l17.setBounds(760,70,200,25);
         l17.setFont(new Font("Tahoma",Font.ITALIC,16));
        l17.setForeground(Color.GRAY);
        add(l17);
        
        JLabel l8 = new JLabel("Number : ");
        l8.setBounds(520,110,200,25);
        l8.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l8);
        
        JLabel l18 = new JLabel("");
        l18.setBounds(760,110,200,25);
         l18.setFont(new Font("Tahoma",Font.ITALIC,16));
        l18.setForeground(Color.GRAY);
        add(l18);
        
        JLabel l9 = new JLabel("Email : ");
        l9.setBounds(520,150,200,25);
        l9.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l9);
        
        JLabel l19 = new JLabel("");
        l19.setBounds(760,150,200,25);
         l19.setFont(new Font("Tahoma",Font.ITALIC,16));
        l19.setForeground(Color.GRAY);
        add(l19);
        
        
        
        b2= new JButton("Back");
        b2.setBackground(Color.BLACK); 
        b2.setForeground(Color.white);
        b2.setBounds(560,190,200,40);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0,200,900,200);
        add(l10);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"';");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id_type"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
               
            }
        } catch (Exception e) {
        }
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
       /* if (ae.getSource() == b1){
            String username = t1.getText();
            String id = t9.getText();
            String number = t2.getText();
            String name = t3.getText();
            String radio = t10.getText();
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            
            String query = "update customer set username='"+username+"' ,id_type = '"+id+"' ,number = '"+number+"' , name ='"+name+"' ,gender =  '"+radio+"',country =  '"+country+"' , address = '"+address+"' , phone = '"+phone+"' , email ='"+email+"'";
            try{
               Conn c = new Conn();
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
               
                this.setVisible(false);
            }catch(Exception e){
            }
         }else */if(ae.getSource()==b2){
             this.setVisible(false);
             
         }
    }
    public static void main(String[] args) {
        new ViewCustomer("").setVisible(true);
    }
    
}

    

