package Lecture3;

public class OOPS {

    public static void main(String[] args) {

        OOPS oops = new OOPS();
        oops.registerStudent(50, "Deepak", "Noida", 8447516023L);
        oops.registerStudent(200, "Aryan", "Gr. Noida", 8447516024L);

    }

     void registerStudent(int roll, String name, String address, long phone) {

        if (roll < 0 || roll > 100) {
            System.out.println("Invalid Roll Number");
        } else if (name.trim().isEmpty()) {
            System.out.println("Enter name");
        } else if (address.trim().isEmpty()) {
            System.out.println("Enter address");
        } else {
            System.out.println("Registration successful");
        }

    }

}
