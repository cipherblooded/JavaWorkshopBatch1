package Lecture2.ClassAndObjectIntro;

public class StudentObject {

    public static void main(String[] args) {

        Student.collegeName = "GL Bajaj";

        Student stu1 = new Student();
        stu1.name = "Deepak";
        stu1.address = "Noida";

        Student stu2 = new Student();
        stu2.name ="Aryan";
        stu2.address = "Gr. Noida";

        System.out.println(Student.collegeName+" - "+stu1.name+" - "+stu1.address);
        System.out.println(Student.collegeName+" - "+stu2.name+" - "+stu2.address);

    }

}
