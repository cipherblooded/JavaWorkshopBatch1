package Lecture2.TakingInputFromTheUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _InputBufferedReader {
    public static void main(String[] args) throws IOException {

        // Taking Input Using BufferedReader.
        // Wo have to add throws IOException before main.
        // It is faster as compared to Scanner.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        byte var1 = Byte.parseByte(bufferedReader.readLine());
        short var2 = Short.parseShort(bufferedReader.readLine());
        int var3 = Integer.parseInt(bufferedReader.readLine());
        long var4 = Long.parseLong(bufferedReader.readLine());
        float var5 = Float.parseFloat(bufferedReader.readLine());
        double var6 = Double.parseDouble(bufferedReader.readLine());
        String var7 = bufferedReader.readLine();
        char var8 = bufferedReader.readLine().charAt(0);

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
