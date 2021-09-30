package Lecture2.IfElse;
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter percentage");
        float percentage = scanner.nextFloat();

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
