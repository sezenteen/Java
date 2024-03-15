package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import java.sql.*;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection(){
        try {
            Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "123456");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVC", props);
            return connection;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
}