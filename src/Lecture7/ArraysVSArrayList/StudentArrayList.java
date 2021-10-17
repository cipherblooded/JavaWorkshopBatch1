package Lecture7.ArraysVSArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList of Student Class which contains multiple students
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("----------------------------");
            System.out.println("Enter the data of student "+ (i+1) );

            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter your address");
            String address = scanner.next();
            System.out.println("Enter your college");
            String college = scanner.next();

            Student student = new Student(name,address,college);
            students.add(student);
        }

        for (int i = 0; i < students.size(); i++) {

            Student studentKaData = students.get(i); //
            System.out.println("Data of Student "+ (i+1));
            System.out.print(studentKaData.name+ " ");
            System.out.print(studentKaData.address+ " ");
            System.out.print(studentKaData.college+ " ");
            System.out.println();
            System.out.println();

        }
    }
}
