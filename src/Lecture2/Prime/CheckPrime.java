package Lecture2.Prime;

import java.util.Scanner;

public class CheckPrime {

    // Checking a number is prime or not.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPrime= true;
        int div=2;

        while (div*div<=n){
            if(n%div==0){
                isPrime=false;
                break;
            }
            div++;
        }

        if(isPrime){
            System.out.println(n+" is prime");
        }else {
            System.out.println(n+" is not prime");
        }
    }
}
