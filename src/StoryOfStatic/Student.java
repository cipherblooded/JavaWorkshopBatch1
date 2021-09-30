package StoryOfStatic;

public class Student {

    public String name;
    public String address;
    public String college;
    public static int humanCount = 0;

    Student(String name, String address, String college){

        this.name = name;
        this.address = address;
        this.college = college;
        humanCount++;

    }

}
