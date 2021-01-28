
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Connect {
  public Statement state;
  public ResultSet res;
  public Connection con;
  
  public Connection setConnection()
  {
    try{ Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/maildata","root","");
    
    }
    catch(Exception ex){
       System.out.println(ex.toString()) ;
    } 
    return con;
  }
  
  
  public ResultSet getResult(String query,Connection con){
     this.con=con;
      try{
         state=con.createStatement();
         res=state.executeQuery(query);
      }
      catch(Exception exe){
          
      }
      return res;
  }
}
