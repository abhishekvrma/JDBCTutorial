import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection getConnection()
    {

        Connection con = null;

        try{
            if (con==null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_tutorial","root","root1234");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }


}
