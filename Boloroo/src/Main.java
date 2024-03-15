import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {


        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "123456");

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/soft_uni", props);
        PreparedStatement stmt =
                connection.prepareStatement("SELECT * FROM employees WHERE salary > ? and salary  < ?");
        stmt.setDouble(1, 1000);
        stmt.setDouble(2, 1000000);

        stmt.setMaxRows(5);

        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getString("job_title"));
        }

        connection.close();
    }
}