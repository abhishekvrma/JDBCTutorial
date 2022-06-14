import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

    public static void main(String[] args) {

        try{

            Connection con = ConnectionProvider.getConnection();

            String query = "select * from Persons";

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(query);

            while(set.next())
            {
                int id = set.getInt("PersonID");
                String lastName = set.getString("LastName");
                String firstName=set.getString("firstName");
                String address = set.getString("Address");
                String city = set.getString("City");

                System.out.println("Person with ID "+id+" and name "+firstName+" "+lastName+" lives in "+address+" "+city);
            }
            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
