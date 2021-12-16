package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton b,b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    Login(){
        //setSize(400,400);
        //setLocation(400,200);
        setLayout(null);//Border Layout,Flow Layout ,Grid Layout//
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setBounds(400,250,900,400);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        b = new JButton("Build by ->->-> Jatin Suthar(18BCON591)");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setBounds(0,340,400,20);
        b.setBorder(BorderFactory.createEtchedBorder());
        b.addActionListener(this);
        p1.add(b);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(80,80,200,200);
        p1.add(l1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(500,50,500,500);
        p2.setBackground(Color.LIGHT_GRAY);
        add(p2);
        
        JLabel l2 = new JLabel("Username");
        l2.setBounds(60,20,100,25);
        l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(60,50,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(60,90,100,25);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l3);
        
        t2 = new JPasswordField();
        t2.setBounds(60,120,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        b1 = new JButton("Login");
        b1.setBounds(60, 160, 80, 25);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Signup");
        b2.setBounds(180, 160, 80, 25);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("Forgot Password");
        b3.setBounds(100, 200, 120, 25);
        b3.setForeground(new Color(133,193,233));
        b3.setBackground(Color.WHITE);
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        b3.addActionListener(this);
        p2.add(b3);
        
        JLabel l4 = new JLabel("Trouble in login....");
        l4.setBounds(230,200,100,20);
        l4.setFont(new Font("SAN_SERIF",Font.PLAIN,10));
        l4.setForeground(Color.RED);
        p2.add(l4);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            try{
               String username = t1.getText();
               String password = t2.getText();
               String sql = "select * from account where username = '"+username+"' AND password = '"+password+"';";
               Conn c = new Conn();
               ResultSet rs = c.s.executeQuery(sql);
               if (rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null,"Invalid Login");
               }
               
            }catch(Exception e){}
            
        }else if (ae.getSource() == b2){
            
            this.setVisible(false);
            new Signup().setVisible(true);
            
        }else if (ae.getSource() == b3){
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
    
        }else if (ae.getSource() == b){
            this.setVisible(false);
        }        
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
