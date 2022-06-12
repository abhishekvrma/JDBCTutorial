import java.sql.*;

public class CreateConnection {

public static void main(String[] args) {

try{
//load driver class
Class.forName("com.mysql.cj.jdbc.Driver");

//creating connection
String url = "jdbc:mysql://localhost:3306/jdbc_tutorial";
String userName= "root";
String password = "root1234";

Connection con = DriverManager.getConnection(url,userName,password);

//check if connection is created and open

if (con.isClosed())
{
  System.out.println("Connection is closed");
}
else
{
  System.out.println("Connection created successfully");
}


}
catch (Exception e)
{
  e.printStackTrace();
}

}

}
