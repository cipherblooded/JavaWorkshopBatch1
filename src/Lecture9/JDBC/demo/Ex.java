package Lecture9.JDBC.demo;
import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {


        try {
            String a = new Scanner(System.in).nextLine();
            int i = Integer.parseInt(a);

            System.out.println(i / 0);

            System.out.println(i);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("zero error " + e.getMessage());
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("number error " + e.getMessage());
        }

    }

}
