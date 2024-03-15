package Controller;

import Model.DAO.StudentDAO;
import Model.Entidy.Student;
import View.StudentView;

public class StudentController {
    private Student studentModel;
    private StudentView studentView;

    public StudentController() {

    }

    public StudentController(Student studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public void setStudentAge(int age){
        studentModel.setAge(age);
    }

    public Integer getStudentAge(){
        return studentModel.getAge();
    }

    public static void updateView(String studName){
       // studentView.printStudentDetails(studentModel.getName(), studentModel.getAge(), studentModel.getPhone());
        StudentDAO studentDAO = new StudentDAO();
        StudentView.printStudentDetails(studentDAO.getByNameStudent(studName));
    }

}
