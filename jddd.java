import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jddd {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jddd:mysql://localhost:3306/kaviya", "root", "RAGUvaran8214");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from person");
            while (rs.next()) {
                System.out.println(rs.getString("rno"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


