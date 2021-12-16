package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ForgotPassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    
    ForgotPassword(){
        setBounds(400,250,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,650,400);
        add(p1); 
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(15,20,100,25);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(250,20,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        b1= new JButton("Search");
        b1.setBounds(500, 20, 100, 25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p1.add(b1);
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(15,80,100,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(250,80,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3 = new JLabel("Your Security Question");
        l3.setBounds(15,140,205,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(250,140,350,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(15,200,100,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(250,200,200,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        b2= new JButton("Retrieve");
        b2.setBounds(500, 200, 100, 25);
        b2.setForeground(Color.white);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p1.add(b2);
        
        JLabel l5= new JLabel("Password");
        l5.setBounds(15,260,100,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);
        
        t5 = new JTextField();
        t5.setBounds(250,260,200,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
        b3= new JButton("Back");
        b3.setBounds(150, 320, 200, 30);
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLACK);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        p1.add(b3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(650,0,250,400);
        p2.setBackground(Color.WHITE);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(18,75,200,200);
        p2.add(l6);
    }
    
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if (ae.getSource() == b3){
            this.setVisible(false);
            new Login().setVisible(true);
            
        }else if(ae.getSource() == b1){
            try{
                String sql = "select * from account where username =  '"+t1.getText()+"';";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                   t2.setText(rs.getString("name"));
                   t3.setText(rs.getString("question"));
                }
            }catch(Exception e){}
        }else if(ae.getSource() == b2){
            try{
                String sql = "select * from account where answer =  '"+t4.getText()+"' AND username = '"+t1.getText()+"';";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                   t5.setText(rs.getString(3));
                }
            }catch(Exception e){}
            
        
        }
    }
    
    public static void main(String[] args) {
        new ForgotPassword().setVisible(true);
    }
    
}
