package Lecture5.demo;

public class MyEnum {

    enum Grade{
        FIRST,
        SECOND,
        THIRD
    }

    public static void main(String[] args) {

        Grade grade = Grade.THIRD;
        System.out.println(grade);

        int[] arr = {1,2,3,4,5,6};

        for (int j : arr) {
            System.out.println(j);
        }

    }

}
