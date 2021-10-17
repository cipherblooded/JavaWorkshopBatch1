package Lecture5.demo;

import java.util.Scanner;

public class College {

    public static void main(String[] args) {

        int nStudent, nTeachers;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        nStudent = sc.nextInt();

        System.out.println("Enter number of teachers");
        nTeachers = sc.nextInt();

        sc.nextLine();

        Student[] stuArr = new Student[nStudent];
        Teacher[] teachArr = new Teacher[nTeachers];

        for (int i = 0; i < stuArr.length; i++) {
            System.out.println("Enter student name");
            Student student = new Student();
            student.name = sc.nextLine();
            System.out.println("Enter student id");
            student.id = sc.nextInt();
            stuArr[i] = student;
            sc.nextLine();

            stuArr[i].study();
            stuArr[i].giveExam();
        }

        for (int i = 0; i < teachArr.length; i++) {
            System.out.println("Enter teacher name");
            Teacher teacher = new Teacher();
            teacher.name = sc.nextLine();
            System.out.println("Enter teacher id");

            teacher.id = sc.nextInt();

            teachArr[i] = teacher;
            sc.nextLine();

        }

        int max = -1, min = 100;

        for (Student student : stuArr) {
            int marks = student.marks;
            if (marks > max)
                max = marks;
            if (marks < min)
                min = marks;

            student.printMarks();
        }

        System.out.println("Max - "+max);
        System.out.println("Min - "+min);

    }

}
