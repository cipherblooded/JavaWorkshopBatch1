package Lecture4.Inheritance;

public class ClassC extends ClassB{

    int myValueC = 10;

    public static void main(String[] args) {

        ClassC obj = new ClassC();

        System.out.println(obj.myValueA);
        System.out.println(obj.myValueB);
        System.out.println(obj.myValueC);

    }

}
