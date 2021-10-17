package Lecture8.StringBuilder;

public class StringBuilder_Data_Structure {

    public static void main(String[] args) {

        // Declaration of StringBuilder in java
        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder);

        // Fetching an Element at particular index
        char ch = stringBuilder.charAt(0);
        System.out.println("Character at 0th index is: "+ch);

        // Updating character at particular index
        stringBuilder.setCharAt(0,'b');
        System.out.println("StringBuilder after setting 'b' at 0th index: "+stringBuilder);

        // Inserting character at particular index
        stringBuilder.insert(1,"a");
        System.out.println("StringBuilder after inserting 'a' at 1st index: "+stringBuilder);

        // Removing a character at particular index
        stringBuilder.deleteCharAt(2);
        System.out.println("StringBuilder after deleting character at 2nd index: "+stringBuilder);

        // Adding character at last of stringBuilder
        stringBuilder.append('a');
        System.out.println("StringBuilder after adding a at the last: "+stringBuilder);

        // Printing the size of StringBuilder
        int lengthOfBuilder = stringBuilder.length();
        System.out.println("Final length of StringBuilder: "+lengthOfBuilder);

    }
}
