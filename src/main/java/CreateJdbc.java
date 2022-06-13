import java.sql.*;

public class CreateJdbc {
  public static void main(String[] args) {

  try{
  //load driver class
  Class.forName("com.mysql.cj.jdbc.Driver");

  //creating connection
  String url = "jdbc:mysql://localhost:3306/jdbc_tutorial";
  String userName= "root";
  String password = "root1234";

  Connection con = DriverManager.getConnection(url,userName,password);

  //
  String query = "CREATE TABLE Persons(PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255))";

Statement stmt = con.createStatement();
stmt.executeUpdate(query);

System.out.println("Query executed successfully");

  }
  catch (Exception e)
  {
    e.printStackTrace();
  }

  }
}
