package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Destination extends JFrame implements Runnable{
    Thread t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel [] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    
    public void run(){
        try {
        for (int i = 0; i <=9; i++) {
            this.label[i].setVisible(true);
            
            Thread.sleep(2800);
            this.label[i].setVisible(false);
            
            }
        this.setVisible(false);
            
        }catch (Exception e) {
        }
    }
    
    Destination(){
        
        setBounds(400,250,900,400);
         t = new Thread(this);
        
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon [] image = new ImageIcon[] {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
        
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
        Image [] jimage = new Image[] {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
        ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
        ImageIcon [] iimage = new ImageIcon[] {i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
        
        
        
        for (int i = 0; i <=9; i++) {
        
            image[i] = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest"+(i+1)+".jpg"));
            jimage[i] =image[i].getImage().getScaledInstance(900,400, Image.SCALE_DEFAULT);
            iimage[i] = new ImageIcon(jimage[i]);
            this.label[i] = new JLabel(iimage[i]);
            this.label[i].setBounds(0,0,900,400);
            add(this.label[i]);
        }
       
        t.start();
    }
    public static void main(String[] args) {
        new Destination().setVisible(true);
    }
}
