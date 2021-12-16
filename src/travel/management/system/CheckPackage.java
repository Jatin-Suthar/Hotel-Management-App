package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame {
    CheckPackage(){
        setBounds(400,250,900,400);
        
        String [] Package1 = new String[]{"GOLD PACKAGE", "7 DAYS AND 8 NIGHTS", "HOTEL NOT INLCUDED!", "HELICOPTER RIDE" , "HORSE RIDING AND OTHER GAMES" , "BBQ DINNER" , "FREE NATIVE SOUVENIRS" , "ENGLISH SPEAKING GUIDE"," SPRING SPECIAL" , "RS. 32000/-","package3.jpg"};
        String [] Package2 = new String[]{"SILVER PACKAGE", "6 DAYS AND 7 NIGHTS", "HOTEL NOT INCLUDED!", "FULL DAY CITY TOUR" , "FREE RENTAL CAR" , "WELCOME DRINKS ON ARRIVAL" , "NEXT DAY CRUISE" , "ENGLISH SPEAKING GUIDE","SUMMER SPECIAL" , "RS. 24000/-","package1.jpg"};
        String [] Package3 = new String[]{"BRONZE PACKAGE", "5 DAYS AND 6 NIGHTS", "HOTEL NOT INCLUDED!", "OPTION FOR CAR RENTAL" , "NIGHT SAFARI" , "DINER ON CRUISE" , "FULL DAY CRUISE" , "ENGLISH SPEAKING GUIDE","WINTER SPECIAL" , "RS. 12000/-","package2.jpg"};
        

        getContentPane().setBackground(Color.WHITE);
        JPanel p1 = createPackage(Package1);
        JPanel p2 = createPackage(Package2);
        JPanel p3 = createPackage(Package3);
        
        JTabbedPane pane = new JTabbedPane();
        pane.addTab("Package 1",null,p1);
        pane.addTab("Package 2",null,p2);
        pane.addTab("Package 3",null,p3);
        add(pane,BorderLayout.CENTER);
        
    }
    
    public JPanel createPackage(String [] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(350,5,400,30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(20,50,300,20);
        l2.setForeground(Color.ORANGE);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(20,90,300,20);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(20,130,300,20);
        l4.setForeground(Color.ORANGE);
        l4.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(20,170,300,20);
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(20,210,300,20);
        l6.setForeground(Color.ORANGE);
        l6.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(20,250,300,20);
        l7.setForeground(Color.RED);
        l7.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(20,290,300,20);
        l8.setForeground(Color.ORANGE);
        l8.setFont(new Font("Tahoma",Font.BOLD,16));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(630,140,300,40);
        l9.setForeground(Color.CYAN);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(700,290,300,25);
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Tahoma",Font.ITALIC,25));
        p1.add(l10);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[10]));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0,0,900,400);
        p1.add(l11);
        
        return p1;
    }    
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
    
}
