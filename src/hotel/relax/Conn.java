package hotel.relax;

import java.beans.Statement;
import java.sql.Connection;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
      try{
         Class.forName("com.mysql.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql:///hotelmangementsystem","root","");
         s = c.createStatement();
         
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
}
