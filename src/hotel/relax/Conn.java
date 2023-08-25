package hotel.relax;

public class Conn {
    Conn(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
}
