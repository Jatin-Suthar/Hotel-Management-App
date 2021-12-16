package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener  {
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JLabel l20,l21;
    
    
    JButton b1,b2;
    String user  ;
    String n;
    UpdateCustomer(String username){
        this.user = username;
      
        setBounds(400,250,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l0 = new JLabel("UPDATE CUSTOMER DETAILS");
        l0.setFont(new Font ("Tahoma",Font.BOLD,20));
        l0.setBounds(550,10,300,25);
        add(l0);
        
        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(30,20,200,25);
        
        add(l1);
        
        l20 = new JLabel();
        l20.setBounds(250,20,200,25);
        add(l20);
        
        JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30,50,200,25);
        add(l2);
        
        t9 = new JTextField() ;
        t9.setBounds(250,50,200,25);
        add(t9);
        
        JLabel l3 = new JLabel("Number : ");
        l3.setBounds(30,80,200,25);
        add(l3);
        
        t2 = new JTextField();
        t2.setBounds(250,80,200,25);
        add(t2);
        
        JLabel l4 = new JLabel("Name : ");
        l4.setBounds(30,110,200,25);
        add(l4);
        
        l21 = new JLabel();
        l21.setBounds(250,110,200,25);
        add(l21);
        
        JLabel l5 = new JLabel("Gender : ");
        l5.setBounds(30,140,200,25);
        add(l5);
        
        t10 = new JTextField();
        t10.setBounds(250,140,200,25);
        add(t10);
        
        JLabel l6 = new JLabel("Country : ");
        l6.setBounds(30,170,200,25);
        add(l6);
        
        t4 = new JTextField();
        t4.setBounds(250,170,200,25);
        add(t4);
        
        JLabel l7 = new JLabel("Address : ");
        l7.setBounds(30,200,200,25);
        add(l7);
        
        t5 = new JTextField();
        t5.setBounds(250,200,200,25);
        add(t5);
        
        JLabel l8 = new JLabel("Number : ");
        l8.setBounds(30,230,200,25);
        add(l8);
        
        t6 = new JTextField();
        t6.setBounds(250,230,200,25);
        add(t6);
        
        JLabel l9 = new JLabel("Email : ");
        l9.setBounds(30,260,200,25);
        add(l9);
        
        t7 = new JTextField();
        t7.setBounds(250,260,200,25);
        add(t7);
        
        b1= new JButton("Update");
        b1.setBackground(Color.BLACK); 
        b1.setForeground(Color.white);
        b1.setBounds(100,300,100,25);
        b1.addActionListener(this);
        add(b1);
        
        b2= new JButton("Back");
        b2.setBackground(Color.BLACK); 
        b2.setForeground(Color.white);
        b2.setBounds(250,300,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(470,0,400,400);
        add(l10);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username =  '"+username+"';");
            while(rs.next()){
                l20.setText(rs.getString("username"));
                t9.setText(rs.getString("id_type"));
                t2.setText(rs.getString("number"));
                l21.setText(rs.getString("name"));
                t10.setText(rs.getString("gender"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                this.n = l21.getText();
               
            }
        } catch (Exception e) {
        }
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
           
            String id = t9.getText();
            String number = t2.getText();
           
            String radio = t10.getText();
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            
            String query = "update customer set username='"+user+"' ,id_type = '"+id+"' ,number = '"+number+"' , name ='"+n+"' ,gender =  '"+radio+"',country =  '"+country+"' , address = '"+address+"' , phone = '"+phone+"' , email ='"+email+"'";
            try{
               Conn c = new Conn();
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
               
                this.setVisible(false);
            }catch(Exception e){
            }
         }else if(ae.getSource()==b2){
             this.setVisible(false);
             
         }
    }
    public static void main(String[] args) {
        new UpdateCustomer("").setVisible(true);
    }
    
}

    

