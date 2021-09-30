package Lecture1;

public class DataTypeAndVariables {
    public static void main(String[] args) {

        // https://www.w3schools.com/java/java_variables.asp

        // Syntax of Declaring a variable in java
        // DataType variableName = value;

        // Most important Data Types

        int var1 = 1234362673; // it can hold value upto 9 digits. it ranges from (-2147483648 to 2147483647)
        long var2 = 7839873864792396384L; // it can hold value upto 18 digits. it ranges from (-9223372036854775808 to 9223372036854775807)
        float var3 = 12.67f; // it ranges (1.40239846e-45f to 3.40282347e+38f).
        double var4 = 10007328.4862; // it ranges from (4.94065645841246544e-324 to 1.79769313486231570e+308).
        boolean var5 = true; // it contains value which is either true or false
        char var6 = 'a'; // it contains a single character.


        byte var7 = 25; // it ranges from (-128 to 127).
        short var8 = 6722; // it ranges from (-32768 to 32767).

        String var9 = "Aryan"; // String to store

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);

    }
}
