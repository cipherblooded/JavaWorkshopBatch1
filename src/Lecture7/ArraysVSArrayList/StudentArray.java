package Lecture7.ArraysVSArrayList;

public class StudentArray {

    public static void main(String[] args) {

        // Creating an array of Student Class which contains 10 students
        Student[] array = new Student[10];

        Student student0 = new Student();
        student0.name = "A";
        student0.address = "Noida";
        student0.college = "GNIOT";

        Student student1 = new Student();
        student1.name = "B";
        student1.address = "Noida";
        student1.college = "GNIOT";

        Student student2 = new Student();
        student2.name = "C";
        student2.address = "Noida";
        student2.college = "GNIOT";

        Student student3 = new Student();
        student3.name = "D";
        student3.address = "Noida";
        student3.college = "GNIOT";

        Student student4 = new Student();
        student4.name = "E";
        student4.address = "Noida";
        student4.college = "GNIOT";

        Student student5 = new Student("F","noida", "Gnoit");
        Student student6 = new Student("G","noida", "Gnoit");
        Student student7 = new Student("H","noida", "Gnoit");
        Student student8 = new Student("I","noida", "Gnoit");
        Student student9 = new Student("J","noida", "Gnoit");

        array[0] = student0;
        array[1] = student1;
        array[2] = student2;
        array[3] = student3;
        array[4] = student4;
        array[5] = student5;
        array[6] = student6;
        array[7] = student7;
        array[8] = student8;
        array[9] = student9;

        for (int i = 0; i < array.length; i++) {

            Student studentKaData = array[i]; //
            System.out.println("Data of Student"+ i);
            System.out.print(studentKaData.name+ " ");
            System.out.print(studentKaData.address+ " ");
            System.out.print(studentKaData.college+ " ");
            System.out.println();
            System.out.println();

        }
    }
}
