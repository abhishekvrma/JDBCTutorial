import java.sql.*;
import java.util.Scanner;

public class InsertQuery {
  public static void main (String args[])
  {
try {

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/jdbc_tutorial";
String userName = "root";
String password = "root1234";

Connection con = DriverManager.getConnection(url,userName,password);

String query = "insert into jdbc_tutorial.Persons(LastName,FirstName,Address,City) Values (?,?,?,?)";

PreparedStatement pstmt = con.prepareStatement(query);

Scanner sc = new Scanner(System.in);

System.out.println("Please enter laste name");

String lastName= sc.nextLine();

System.out.println("Please enter first name");
String firstName= sc.nextLine();

System.out.println("Please enter Address");
String address= sc.nextLine();

System.out.println("Please enter city");
String city= sc.nextLine();

pstmt.setString(1,lastName);
pstmt.setString(2,firstName);
pstmt.setString(3,address);
pstmt.setString(4,city);

pstmt.executeUpdate();

System.out.println("Inserted");

con.close();


}
catch (Exception e)
{
  e.printStackTrace();
}

  }
}
