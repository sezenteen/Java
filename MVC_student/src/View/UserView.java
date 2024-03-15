package View;

import Model.DAO.User;
import Model.Entidy.Student;

import java.util.List;

public class UserView {

    // public void printStudentDetails(String name, int age, String phone){
    //    System.out.println("Оюутны тухай мэдээлэл: ");
    //  System.out.println("Нэр: " + name);
    //System.out.println("Нас: " + age);
    //System.out.println("Утас: " + phone);

    public static void printUSerDetails(List<User> users){

        for(User user: users){
            System.out.println("Хэрэглэгчийн нэр: " + user.getUsername() + "\n ID: " + user.getId()  +  "\n Нууц үг: " + user.getPassword() +  "\n Албан тушаал: " + user.getRole());
        }

    }

}

