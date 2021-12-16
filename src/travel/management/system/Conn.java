package travel.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_manager","root","Jatin@300");
            s = c.createStatement();
            System.out.println("Successsfully connected");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
