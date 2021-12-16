
package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
    
    public void run(){
        try{
           for (int i=1 ; i<=101 ; i++){
               int m = p.getMaximum();
               int n =p.getValue();
               if(n<m){
                   p.setValue(p.getValue() + 1);
               }else{
                   i=101;
                   setVisible(false);
                   new Home(username).setVisible(true);
               }
               Thread.sleep(30);
           }
           
        }catch(Exception e){}
    }
    Loading(String user){
        username = user;
        t=new Thread(this);
        setBounds(500,250,500,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Travel and Tourism Application");
        l1.setBounds(10,20,470,40);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(90,120,300,30);
        add(p);
        
        JLabel l2 = new JLabel("Please WAIT...");
        l2.setBounds(90,150,90,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,12));
        l2.setForeground(Color.RED);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome " + username);
        l3.setBounds(10,330,190,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,12));
        l3.setForeground(Color.RED);
        add(l3);
        t.start();
    
    }
    
    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }
    
    
}
