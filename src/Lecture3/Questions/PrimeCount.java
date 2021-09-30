package Lecture3.Questions;

public class PrimeCount {

    public static void main(String[] args) {

        int count = 0;
        int i = 2;
        while (count <= 1000) {
            if (isPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println();

    }

    public static boolean isPrime(int number) {

        boolean found = false;
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                found = true;
                break;
            }
        }
        return !found;

    }

}
