package Test;


import java.util.Scanner;

public class StudentMain {
      StudentModel studentModel;
    Scanner sc = new Scanner(System.in);
    String name;
     int age;
    String Standard;
     int Roll_no;
    int phone;
     String Address;


    void getData(){
        System.out.println("Enter your name : ");
        name=sc.next();
        System.out.println("Enter your age : ");
        age=sc.nextInt();
        System.out.println("Enter your Standard : ");
        Standard=sc.next();
        System.out.println("Enter your Roll no. : ");
        Roll_no=sc.nextInt();
        System.out.println("Enter your phone : ");
        phone=sc.nextInt();
        System.out.println("Enter your Address : ");
        Address=sc.next();
    }
    void setDataToModel(){
        studentModel = new StudentModel(name, age, Standard,Roll_no,phone,Address);
    }
    void displayStudentDetails(){
        System.out.println("Student's name : "+studentModel.name);
        System.out.println("Student's age : "+age);
        System.out.println("Student's Standard : "+Standard);
        System.out.println("Student's Roll no. : "+Roll_no);
        System.out.println("Student's phone : " +phone);
        System.out.println("Student's Address : "+Address);

    }

}
