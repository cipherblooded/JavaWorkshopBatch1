package Lecture0.StoryOfStatic;

public class Student {

    public String name;
    public String address;
    public String college;
    public static int studentCount = 0;

    Student(String name, String address, String college){

        this.name = name;
        this.address = address;
        this.college = college;
        studentCount++;

    }

}
