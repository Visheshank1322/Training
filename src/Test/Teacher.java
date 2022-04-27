package Test;

import java.util.Scanner;

public class Teacher {
    Scanner sc = new Scanner(System.in);
    String name;
    String email;
    int id;
    int phone;

    void getTeacherData(){
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter your email : ");
        email=sc.next();
        System.out.println("Enter your ID : ");
        id=sc.nextInt();
        System.out.println("Enter your Phone Number : ");
        phone=sc.nextInt();

    }
    void displayTeacherDetails(){
        System.out.println("Teacher's name : "+name);
        System.out.println("Teacher's email : "+email);
        System.out.println("Teacher's ID : "+id);
        System.out.println("Teacher's Phone-number : "+phone);
    }
}
