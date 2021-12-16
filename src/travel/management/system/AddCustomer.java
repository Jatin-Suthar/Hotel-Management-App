package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JComboBox c1;
    JLabel l20,l21;
    JRadioButton r1,r2;
    JButton b1,b2;
    AddCustomer(String username){
      
        setBounds(400,250,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(30,20,200,25);
        
        add(l1);
        
        l20 = new JLabel();
        l20.setBounds(250,20,200,25);
        add(l20);
        
        JLabel l2 = new JLabel("ID : ");
        l2.setBounds(30,50,200,25);
        add(l2);
        
        c1 = new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Ration Card"});
        c1.setBounds(250,50,200,25);
        add(c1);
        
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
        
        r1 = new JRadioButton("Male");
        r1.setBounds(250,140,90,25);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setBounds(360,140,90,25);
        r2.setBackground(Color.WHITE);
        add(r2);
        
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
        
        b1= new JButton("Add");
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(470,0,400,400);
        add(l10);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"';");
            while(rs.next()){
                l20.setText(rs.getString("username"));
                l21.setText(rs.getString("name"));
                
            }
        } catch (Exception e) {
        }
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            String username = l20.getText();
            String id = (String)c1.getSelectedItem();
            String number = t2.getText();
            String name = l21.getText();
            String radio = null;
            if(r1.isSelected()){
                radio = "Male";
            }else if (r2.isSelected()){
                radio = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            
            String query = "insert into customer values('"+username+"' , '"+id+"' , '"+number+"' , '"+name+"' , '"+radio+"', '"+country+"' , '"+address+"' , '"+phone+"' , '"+email+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
               
                this.setVisible(false);
            }catch(Exception e){
            }
         }else if(ae.getSource()==b2){
             this.setVisible(false);
             
         }
    }
    public static void main(String[] args) {
        new AddCustomer("").setVisible(true);
    }
    
}
