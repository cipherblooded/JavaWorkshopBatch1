package Lecture5.demo;

public class Student extends Human {

    // Variables or Data Members
    int knowledge;
    int marks;

    // Methods or Behaviour
    void study() {
        knowledge = (int) (0 + Math.random() * (100 + 1));
    }
    void giveExam() {
        marks = (int) (knowledge + Math.random() * (100 - knowledge + 1));
    }
    void printMarks() {
        System.out.println(name + " - " + marks);
    }

}
