import Controller.StudentController;
import Model.Entidy.Student;
import View.StudentView;

public class Main {
    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        studentController.updateView("Бат");
    }
}