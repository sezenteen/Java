package Model.DAO;

import Model.Entidy.Student;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentDAO {
    private Connection connection = null;

    public StudentDAO() {
        connection = DBConnection.DBConnection.getConnection();
    }

    public List<Student> getByNameStudent(String name){
        List<Student> studentsModel = new ArrayList<Student>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student where name like ?");
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setPhone(rs.getString("phone"));

                studentsModel.add(student);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return studentsModel;
    }

}
