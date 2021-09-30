package Lecture3.Questions;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        if(n%3==0){
            System.out.println("Multiple of 3k");
        }else if (n%3==1){
            System.out.println("Multiple of 3k+1");
        }else if(n%3 == 2){
            System.out.println("Multiple of 3k+2");
        }

    }

}
