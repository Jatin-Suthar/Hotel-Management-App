package travel.management.system;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class ticket extends JFrame implements ActionListener {
    JLabel l11,l12,l13,l14,l15,l16,l17,l18,l19;
    JLabel username33,hotel33,persons33,days33,ac33,food33,id33,phone33,number33;
    JLabel username22,package22,persons22,id22,number22,phone22;
    JLabel packagecost11,hotelcost22;
    JButton b1,b2;
    JPanel p1;
    ticket(String username){
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(40,40,500,700);
        
         p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,0,500,500);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
        l1.setBounds(10,5,600,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l1);
        
        JLabel l2 = new JLabel("BUILD BY : Jatin Suthar(18BCON591)");
        l2.setBounds(90,30,600,15);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l2);
        
        JLabel l3 = new JLabel("MY TICKET");
        l3.setBounds(190,60,600,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        
//USER DETAILS
        
        JLabel l4 = new JLabel("USER DETAILS: ");
        l4.setBounds(10,110,300,15);
        p1.add(l4);
        
        JLabel l5 = new JLabel("Username : ");
        l5.setBounds(10,140,60,10);
        l5.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l5);
        
        l11 = new JLabel("");
        l11.setBounds(90,140,100,10);
        l11.setFont(new Font("Tahoma",Font.ITALIC,10));
        l11.setForeground(Color.GRAY);
        p1.add(l11);
        
        JLabel l6 = new JLabel("ID : ");
        l6.setBounds(10,160,60,10);
        l6.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l6);
        
        l12 = new JLabel("");
        l12.setBounds(90,160,100,10);
         l12.setFont(new Font("Tahoma",Font.ITALIC,10));
        l12.setForeground(Color.GRAY);
        p1.add(l12);
        
        JLabel l7 = new JLabel("Number : ");
        l7.setBounds(10,180,200,10);
        l7.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l7);
        
        l13 = new JLabel("");
        l13.setBounds(90,180,200,10);
         l13.setFont(new Font("Tahoma",Font.ITALIC,10));
        l13.setForeground(Color.GRAY);
        p1.add(l13);
        
        JLabel l8 = new JLabel("Name : ");
        l8.setBounds(170,140,60,10);
        l8.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l8);
        
        l14 = new JLabel("");
        l14.setBounds(230,140,200,10);
         l14.setFont(new Font("Tahoma",Font.ITALIC,10));
        l14.setForeground(Color.GRAY);
        p1.add(l14);
        
        JLabel l9 = new JLabel("Gender : ");
        l9.setBounds(170,160,200,10);
        l9.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l9);
        
        l15 = new JLabel("");
        l15.setBounds(230,160,200,10);
         l15.setFont(new Font("Tahoma",Font.ITALIC,10));
        l15.setForeground(Color.GRAY);
        p1.add(l15);
        
        JLabel l10 = new JLabel("Country : ");
        l10.setBounds(170,180,200,10);
        l10.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(l10);
        
         l16 = new JLabel("");
        l16.setBounds(230,180,200,10);
         l16.setFont(new Font("Tahoma",Font.ITALIC,10));
        l16.setForeground(Color.GRAY);
        p1.add(l16);
        
        JLabel address1 = new JLabel("Address : ");
        address1.setBounds(330,140,200,10);
        address1.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(address1);
        
         l17 = new JLabel("");
        l17.setBounds(400,140,200,10);
         l17.setFont(new Font("Tahoma",Font.ITALIC,10));
        l17.setForeground(Color.GRAY);
        p1.add(l17);
        
        JLabel number1 = new JLabel("Number : ");
        number1.setBounds(330,160,200,10);
        number1.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(number1);
        
         l18 = new JLabel("");
        l18.setBounds(400,160,200,10);
         l18.setFont(new Font("Tahoma",Font.ITALIC,10));
        l18.setForeground(Color.GRAY);
        p1.add(l18);
        
        JLabel email1 = new JLabel("Email : ");
        email1.setBounds(330,180,200,10);
        email1.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(email1);
        
         l19 = new JLabel("");
        l19.setBounds(400,180,200,10);
         l19.setFont(new Font("Tahoma",Font.ITALIC,10));
        l19.setForeground(Color.GRAY);
        p1.add(l19);
        
//PACKAGE DETAILS
        
        JLabel pack = new JLabel("PACKAGE DETAILS: ");
        pack.setBounds(10,230,300,15);
        p1.add(pack);
        
        JLabel username2 = new JLabel("Username : ");
        username2.setBounds(10,260,60,10);
        username2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(username2);
        
         username22 = new JLabel("");
        username22.setBounds(90,260,100,10);
        username22.setFont(new Font("Tahoma",Font.ITALIC,10));
        username22.setForeground(Color.GRAY);
        p1.add(username22);
        
        JLabel id2 = new JLabel("ID : ");
        id2.setBounds(10,280,60,10);
        id2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(id2);
        
         id22 = new JLabel("");
        id22.setBounds(90,280,100,10);
         id22.setFont(new Font("Tahoma",Font.ITALIC,10));
        id22.setForeground(Color.GRAY);
        p1.add(id22);
        
        JLabel package2 = new JLabel("Package : ");
        package2.setBounds(170,260,60,10);
        package2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(package2);
        
         package22 = new JLabel("");
        package22.setBounds(230,260,200,10);
         package22.setFont(new Font("Tahoma",Font.ITALIC,10));
        package22.setForeground(Color.GRAY);
        p1.add(package22);
        
        JLabel number2 = new JLabel("Number : ");
        number2.setBounds(170,280,200,10);
        number2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(number2);
        
         number22 = new JLabel("");
        number22.setBounds(230,280,200,10);
         number22.setFont(new Font("Tahoma",Font.ITALIC,10));
        number22.setForeground(Color.GRAY);
        p1.add(number22);
        
        JLabel persons2 = new JLabel("Total Persons : ");
        persons2.setBounds(330,260,200,10);
        persons2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(persons2);
        
         persons22 = new JLabel("");
        persons22.setBounds(400,260,200,10);
         persons22.setFont(new Font("Tahoma",Font.ITALIC,10));
        persons22.setForeground(Color.GRAY);
        p1.add(persons22);
        
        JLabel phone2 = new JLabel("Phone : ");
        phone2.setBounds(330,280,200,10);
        phone2.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(phone2);
        
         phone22 = new JLabel("");
        phone22.setBounds(400,280,200,10);
         phone22.setFont(new Font("Tahoma",Font.ITALIC,10));
        phone22.setForeground(Color.GRAY);
        p1.add(phone22);
        
//HOTEL DETAILS
        
        JLabel hotel = new JLabel("HOTEL DETAILS: ");
        hotel.setBounds(10,320,300,15);
        p1.add(hotel);
        
        JLabel username3 = new JLabel("Username : ");
        username3.setBounds(10,350,60,10);
        username3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(username3);
        
         username33 = new JLabel();
        username33.setBounds(90,350,100,10);
        username33.setFont(new Font("Tahoma",Font.ITALIC,10));
        username33.setForeground(Color.GRAY);
        p1.add(username33);
        
        JLabel id3 = new JLabel("ID : ");
        id3.setBounds(10,370,60,10);
        id3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(id3);
        
         id33 = new JLabel("");
        id33.setBounds(90,370,100,10);
         id33.setFont(new Font("Tahoma",Font.ITALIC,10));
        id33.setForeground(Color.GRAY);
        p1.add(id33);
        
        JLabel phone3 = new JLabel("Phone : ");
        phone3.setBounds(10,390,200,10);
        phone3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(phone3);
        
         phone33 = new JLabel("");
        phone33.setBounds(90,390,200,10);
         phone33.setFont(new Font("Tahoma",Font.ITALIC,10));
        phone33.setForeground(Color.GRAY);
        p1.add(phone33);
        
       JLabel hotel3 = new JLabel("Hotel : ");
        hotel3.setBounds(170,350,60,10);
        hotel3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(hotel3);
        
         hotel33 = new JLabel();
        hotel33.setBounds(230,350,200,10);
         hotel33.setFont(new Font("Tahoma",Font.ITALIC,10));
        hotel33.setForeground(Color.GRAY);
        p1.add(hotel33);
        
        JLabel number3 = new JLabel("Number : ");
        number3.setBounds(170,370,200,10);
        number3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(number3);
        
         number33 = new JLabel("");
        number33.setBounds(230,370,200,10);
         number33.setFont(new Font("Tahoma",Font.ITALIC,10));
        number33.setForeground(Color.GRAY);
        p1.add(number33);
        
        JLabel ac3 = new JLabel("AC? : ");
        ac3.setBounds(170,390,200,10);
        ac3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(ac3);
        
         ac33 = new JLabel("");
        ac33.setBounds(230,390,200,10);
         ac33.setFont(new Font("Tahoma",Font.ITALIC,10));
        ac33.setForeground(Color.GRAY);
        p1.add(ac33);
        
        JLabel persons3 = new JLabel("Total Persons : ");
        persons3.setBounds(330,350,200,10);
        persons3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(persons3);
        
         persons33 = new JLabel("");
        persons33.setBounds(400,350,200,10);
        persons33.setFont(new Font("Tahoma",Font.ITALIC,10));
        persons33.setForeground(Color.GRAY);
        p1.add(persons33);
        
        JLabel days3 = new JLabel("No of Days : ");
        days3.setBounds(330,370,200,10);
        days3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(days3);
        
         days33 = new JLabel("");
        days33.setBounds(400,370,200,10);
         days33.setFont(new Font("Tahoma",Font.ITALIC,10));
        days33.setForeground(Color.GRAY);
        p1.add(days33);
        
        JLabel food3 = new JLabel("Food? : ");
        food3.setBounds(330,390,200,10);
        food3.setFont(new Font("Tahoma",Font.PLAIN,10));
        p1.add(food3);
        
         food33 = new JLabel("");
        food33.setBounds(400,390,200,10);
         food33.setFont(new Font("Tahoma",Font.ITALIC,10));
        food33.setForeground(Color.GRAY);
        p1.add(food33);
        
        JLabel packagecost = new JLabel("Total Package Cost: ");
        packagecost.setBounds(20,430,200,25);
        p1.add(packagecost);
                
        packagecost11 = new JLabel();
        packagecost11.setBounds(140,430,200,25);
        packagecost11.setForeground(Color.RED);
        p1.add(packagecost11);
        
        JLabel hotelcost = new JLabel("Total Hotel Cost: ");
        hotelcost.setBounds(250,430,200,25);
        p1.add(hotelcost);
                
        hotelcost22 = new JLabel("");
        hotelcost22.setBounds(350,430,200,25);
        hotelcost22.setForeground(Color.RED);
        p1.add(hotelcost22);
        
        
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"';");
            while (rs.next()){
                l11.setText(rs.getString(1));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                
            }
            } catch (Exception e) {}
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookpackage where username = '"+username+"';");
            while (rs.next()){
                username22.setText(rs.getString(1));
                packagecost11.setText(rs.getString(7));
                package22.setText(rs.getString(2));
                persons22.setText(rs.getString(3));
                id22.setText(rs.getString(4));
                number22.setText(rs.getString(5));
                phone22.setText(rs.getString(6));
                
            }
            } catch (Exception e) {}
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username = '"+username+"';");
            while (rs.next()){
                username33.setText(rs.getString(1));
                id33.setText(rs.getString(7));
                number33.setText(rs.getString(8));
                phone33.setText(rs.getString(9));
                hotel33.setText(rs.getString(2));
                hotelcost22.setText(rs.getString(10));
                persons33.setText(rs.getString(3));
                days33.setText(rs.getString(4));
                ac33.setText(rs.getString(5));
                food33.setText(rs.getString(6));
                
            }
            } catch (Exception e) {}
        
         b1= new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,500,100,30);
        b1.addActionListener(this);
        add(b1);
        
         b2= new JButton("PRINT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(100,500,100,30);
        b2.addActionListener(this);
        add(b2);
    }
        
    
    public void actionPerformed(ActionEvent ae){    
        if(ae.getSource()==b1){
            this.setVisible(false);
        }else if(ae.getSource() == b2){
            printPanel(p1);
            this.setVisible(false);
        }
    }
private void printPanel(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("Print Record");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(1.2,1.2 );
                
                // Now paint panel as graphics2D
                panel.paint(graphics2D);
                
                // return if page exists
                return Printable.PAGE_EXISTS;
            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
            }catch (PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
            }
        }
    }
public static void main(String[] args) {
        new ticket("").setVisible(true);
    }
}
