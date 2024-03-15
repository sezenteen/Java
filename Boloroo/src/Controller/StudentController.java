package Controller;

import Model.Student;
import View.StudentView;

public class StudentController {
    // Model Object
    // View Object
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // control model object
    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentRollNum(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getStudentRollNum() {
        return model.getRollNo();
    }

    // control view object
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());

    }

}

