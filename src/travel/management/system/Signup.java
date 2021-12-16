package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    Signup(){
        setBounds(400,250,900,400);
        setLayout(null);//Border Layout,Flow Layout ,Grid Layout//
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(25,20,100 ,25);
        l1.setFont(new Font("Tahoma", Font.PLAIN,20));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200,20,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(25,80,100 ,25);
        l2.setFont(new Font("Tahoma", Font.PLAIN,20));
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(200,80,200,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(25,140,100 ,25);
        l3.setFont(new Font("Tahoma", Font.PLAIN,20));
        p1.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(200,140,200,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l5 = new JLabel("Security question");
        l5.setBounds(25,200,155,25);
        l5.setFont(new Font("Tahom", Font.PLAIN,20));
        p1.add(l5);
        
        c1 = new Choice();
        c1.add("Your NickName");
        c1.add("Your Lucky Number");
        c1.add("Your Child Super Hero");
        c1.add("Your Childhood NickName");
        c1.setBounds(200,200,250,25);
        p1.add(c1);
         
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(25,260,100 ,25);
        l4.setFont(new Font("Tahoma", Font.PLAIN,20));
        p1.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(200,260,200,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        b1 = new JButton("Create");
        b1.setBounds(50, 310, 150, 25);
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p1.add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(230, 310, 150, 25);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p1.add(b2);
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(500,0,400,400);
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(100,70,200,200);
        p2.add(l6);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();
            
            String query = "insert into account values('"+username+"' , '"+name+"' , '"+password+"' , '"+security+"' , '"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfully");
               
                this.setVisible(false);
                new Login().setVisible(true);
            }catch(Exception e){
            }
            
    }else if(ae.getSource() == b2){
        new Login().setVisible(true);
        this.setVisible(false);
        
     }
    }
    
    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
