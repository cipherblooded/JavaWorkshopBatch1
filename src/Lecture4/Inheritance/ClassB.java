package Lecture4.Inheritance;

public class ClassB extends ClassA {

    int myValueB = 5;

    @Override
    void printHello() {
        //super.printHello();

        System.out.println("New Hello");

    }

    public static void main(String[] args) {

        ClassB obj = new ClassB();

        obj.printHello();
    }

}
