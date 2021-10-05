package StoryOfStatic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the data of student "+ (i+1) );

            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter your address");
            String address = scanner.next();
            System.out.println("Enter your college");
            String college = scanner.next();

            Student student = new Student(name,address,college);
            arrayList.add(student);
        }

        for (int i = 0; i < arrayList.size(); i++) {

            Student studentKaData = arrayList.get(i); //
            System.out.println("Data of Student"+ i);
            System.out.print(studentKaData.name+ " ");
            System.out.print(studentKaData.address+ " ");
            System.out.print(studentKaData.college+ " ");
            System.out.println();
            System.out.println();
        }
    }
}
