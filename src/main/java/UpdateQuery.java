import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {

    public static void main(String[] args) {

        try {
            Connection con = ConnectionProvider.getConnection();

            String query = "Update Persons set FirstName =? where PersonId=?";

            PreparedStatement stmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter name to update");
            String name = sc.nextLine();
            System.out.println("Please enter id of user");
            int id = sc.nextInt();

            stmt.setString(1,name);
            stmt.setInt(2,id);
            stmt.executeUpdate();
            System.out.println("Done");
            con.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
