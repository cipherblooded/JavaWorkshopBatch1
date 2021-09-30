package Lecture2.Prime;

import java.util.Scanner;

public class PrimeNumber {

    // Printing all prime numbers upto a given number n.
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();

        for(int i=2;i<=n;i++){

            boolean isPrime= true;
            int div=2;
            while (div*div<=i){
                if(i%div ==0){
                    isPrime=false;
                    break;
                }
                div++;
            }
            if(isPrime){
                System.out.print(i+" ");
            }

        }
    }
}
