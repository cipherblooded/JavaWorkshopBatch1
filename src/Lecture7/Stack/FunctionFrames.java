package Lecture7.Stack;

public class FunctionFrames {

    public static void main(String[] args) {

        System.out.println("hi main");
        fun1();
        System.out.println("bye main");

    }
    private static void fun1() {

        System.out.println("hi fun 1");
        fun2();
        System.out.println("bye fun 1");

    }

    private static void fun2() {

        System.out.println("hi fun 2");
        fun3();
        System.out.println("bye fun 2");

    }

    private static void fun3() {

        System.out.println("hi fun 3");
        System.out.println("bye fun 3");

    }


}
