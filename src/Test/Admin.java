package Test;



import java.util.Scanner;


public class Admin {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        StudentMain studentMain = new StudentMain();
        Scanner sc = new Scanner(System.in);
        int c = 0;
        char ch;

        System.out.println("---------Welcome--------");
        System.out.println("Enter details of teacher : ");
        System.out.println("------------------------");
        teacher.getTeacherData();
        System.out.println("-----------------------");
        System.out.println("Enter detail of student : ");
        System.out.println("-----------------------");
        studentMain.getData();
        studentMain.setDataToModel();
        do {
            System.out.println("-------------------");
            System.out.println("--------menu-------");
            System.out.println("-------------------");
            System.out.println("1. print full details");
            System.out.println("2. print Teacher details");
            System.out.println("3. print Student details");
            System.out.println("4. print Teacher name");
            System.out.println("5. print name of Student");
            c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    System.out.println("Full details");
                    teacher.displayTeacherDetails();
                    studentMain.displayStudentDetails();
                }
                case 2 -> {
                    System.out.println("Full details of teacher : ");
                    teacher.displayTeacherDetails();
                }
                case 3 -> {
                    System.out.println("Full details of student : ");
                    studentMain.displayStudentDetails();
                }
                case 4 -> System.out.println("Name of teacher : " + teacher.name);
                case 5 -> System.out.println("Name of student : " + studentMain.name);
                default -> System.out.println("Error");
            }
            System.out.println("Do you want to continue");
            ch = sc.next().toLowerCase().charAt(0);
        } while (ch == 'y');
    }
}