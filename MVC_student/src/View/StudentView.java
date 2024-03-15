package View;

import Model.Entidy.Student;

import java.util.List;

public class StudentView {

    // public void printStudentDetails(String name, int age, String phone){
    //    System.out.println("Оюутны тухай мэдээлэл: ");
    //  System.out.println("Нэр: " + name);
    //System.out.println("Нас: " + age);
    //System.out.println("Утас: " + phone);

    public static void printStudentDetails(List<Student> students){

        for(Student student: students){
            System.out.println("Оюутны нэр: " + student.getName() + "\n Нас: " + student.getAge()  +  "\n Утас: " + student.getPhone());
        }

    }

}
