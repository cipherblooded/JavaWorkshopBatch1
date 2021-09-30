package Lecture3;

import java.util.Scanner;

public class StringTutorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int length = name.length();
        System.out.println(length);

        String upperCaseOfName = name.toUpperCase();
        System.out.println(upperCaseOfName);

        String lowerCaseOfName = name.toLowerCase();
        System.out.println(lowerCaseOfName);

        char character = name.charAt(7);
        System.out.println(character);

        int comparingTwoStrings = name.compareTo("DEEPAK");
        System.out.println(comparingTwoStrings);

        boolean doesContain = name.contains("ka");
        System.out.println(doesContain);

        int indexOfParticularString = name.indexOf("ee");
        System.out.println(indexOfParticularString);

        String replaceWords = name.replace("ee","dd");
        System.out.println(replaceWords);

        String[] words = name.split("\\.");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(name);
        System.out.println("Original - "+name);

    }
}
