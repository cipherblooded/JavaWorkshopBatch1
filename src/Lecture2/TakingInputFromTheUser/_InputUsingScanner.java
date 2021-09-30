package Lecture2.TakingInputFromTheUser;
import java.util.Scanner;

public class _InputUsingScanner {
    public static void main(String[] args){

        // Taking Input Using Scanner.
        // Slower as compare to BufferedReader.
        Scanner scanner = new Scanner(System.in);
        byte var1 = scanner.nextByte();
        short var2 = scanner.nextShort();
        int var3 = scanner.nextInt();
        long var4 = scanner.nextLong();
        float var5 = scanner.nextFloat();
        double var6 = scanner.nextInt();
        String var7 = scanner.next();
        char var8 = scanner.next().charAt(0);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

    }
}
