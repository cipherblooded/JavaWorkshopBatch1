package Lecture3.Questions;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = isEven(number);

        if(result){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }

    }

    public static boolean isEven(int number) {

        return number % 2 == 0;

    }
}
