package Lecture4;

public class Alpha {

    public static void main(String[] args) {

        String str = "My name is Deepak";

        for (int i = 65; i < 91; i++) {
            char myChar = (char) i;
            int index = str.indexOf(myChar);
            if (index == -1) {
                myChar += 32;
                index = str.indexOf(myChar);
            }
            if (index != -1)
                System.out.println(myChar + " -> " + index);
        }

    }

}
