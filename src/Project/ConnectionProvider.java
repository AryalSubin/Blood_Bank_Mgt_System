package Project;
import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getConn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","admin");
            return con;
        }
        
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}
