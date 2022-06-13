import java.sql.*;
import java.io.*;

class PhotoSave {
public static void main(String[] args) {


try {

  Class.forName("com.mysql.cj.jdbc.Driver");

  String url ="jdbc:mysql://localhost:3306/jdbc_tutorial";
  String userName="root";
  String password= "root1234";

  Connection con = DriverManager.getConnection(url,userName,password);

  String query="Insert into images (pic) Values(?)";

  FileInputStream fis = new FileInputStream("/Users/abhishekverma/Downloads/download.jpeg");

  PreparedStatement pstmt=con.prepareStatement(query);
  pstmt.setBinaryStream(1,fis,fis.available());
  pstmt.executeUpdate();
  System.out.println("Done");


}
catch (Exception e)
{
  e.printStackTrace();
}



}

}
