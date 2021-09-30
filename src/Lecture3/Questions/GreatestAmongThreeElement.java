package Lecture3.Questions;

import java.util.Scanner;

public class GreatestAmongThreeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if (a >b && a>c) {
            System.out.println(a + " is greatest");
        } else if( b>a && b>c){
            System.out.println(b + " is greatest");
        } else{
            System.out.println(c + "is greatest");
        }
    }
}
