package StoryOfStatic;

public class StudentObject {

    public static void main(String[] args) {

        Student obj1 = new Student("aryan","noida", "Gnoit");
        Student obj2 = new Student("deepak","NY", "IILM");
        Student obj3 = new Student("dilber","noida", "Gnoit");
        Student obj4 = new Student("ashirvad","noida", "Gnoit");

        System.out.println(obj1.humanCount);
        System.out.println(obj1.name);
        System.out.println(obj2.humanCount);
        System.out.println(obj2.name);
        System.out.println(obj3.humanCount);
        System.out.println(obj3.name);
        System.out.println(obj4.humanCount);
        System.out.println(obj4.name);

    }
}
