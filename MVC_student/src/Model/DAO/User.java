package Model.DAO;

import Model.Entidy.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User {private Connection connection = null;

    public User() {
        connection = DBConnection.DBConnection.getConnection();
    }

    public List<User> getByNameStudent(String name){
        List<User> usersModel = new ArrayList<User>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username like ?");
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setId(rs.getInt("id"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));

                usersModel.add(user);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return usersModel;
    }
}
