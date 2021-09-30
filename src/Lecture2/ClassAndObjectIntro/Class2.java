package Lecture2.ClassAndObjectIntro;

public class Class2 {

    static int totalStudents = 500;
    int myCount = 5;

    public void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {

        Class2.method2();
        Class2 obj = new Class2();
        obj.method1();

        System.out.println(Class2.totalStudents);
        System.out.println(obj.myCount);

    }

}
