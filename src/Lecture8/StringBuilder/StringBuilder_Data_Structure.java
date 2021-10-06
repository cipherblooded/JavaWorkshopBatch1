package Lecture8.StringBuilder;

public class StringBuilder_Data_Structure {
    public static void main(String[] args) {

        // append() :- append at the last of the string
        // setcharAt():-

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0,'b');
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,"aryan");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.charAt(4));

    }
}
