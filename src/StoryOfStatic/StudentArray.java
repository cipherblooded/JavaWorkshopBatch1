package StoryOfStatic;

public class StudentArray {
    public static void main(String[] args) {
        Student [] array = new Student[10]; // array

        Student student0 = new Student("A","noida", "Gnoit");
        Student student1 = new Student("B","noida", "Gnoit");
        Student student2 = new Student("C","noida", "Gnoit");
        Student student3 = new Student("D","noida", "Gnoit");
        Student student4 = new Student("E","noida", "Gnoit");
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
