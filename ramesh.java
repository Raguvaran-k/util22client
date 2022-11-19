import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ramesh {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pugal", "root", "RAGUvaran8214");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from market");
            while (rs.next()) {
                System.out.println(rs.getString("sname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
