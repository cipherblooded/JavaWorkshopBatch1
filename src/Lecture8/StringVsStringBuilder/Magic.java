package Lecture8.StringVsStringBuilder;

public class Magic {

    public static void main(String[] args) {

        String string = new String("");
        StringBuilder stringBuilder = new StringBuilder("");

        long t1 = System.currentTimeMillis();// 10 baj rahe hai

        // String me 'a' add kara hai

        for (int i = 0; i < 100000; i++) {
            string = string+"a";
        }

        long t2 = System.currentTimeMillis(); // 11 baj rahe hai

        // StringBuilder me 'a' add kara hai

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append('a');
        }

        long t3 = System.currentTimeMillis(); // 12 baj rahe hai

        System.out.println("String ex time :"+(t2-t1));
        System.out.println("StringBuilder ex time :"+(t3-t2));

    }
}
