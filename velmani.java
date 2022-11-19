import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class velmani {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("velmani:mysql://localhost:3306/durai", "root", "RAGUvaran8214");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from school");
            while (rs.next()) {
                System.out.println(rs.getString("sname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
