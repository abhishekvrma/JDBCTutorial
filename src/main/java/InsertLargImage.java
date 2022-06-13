import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertLargImage {

    public static void main(String[] args) {

        try {
            Connection con = ConnectionProvider.getConnection();
            String q = "Insert into Images(pic) values(?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);

            File file = fileChooser.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Success");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
