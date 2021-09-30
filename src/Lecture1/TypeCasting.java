package Lecture1;

public class TypeCasting {
    public static void main(String[] args) {


        // Widening Casting (automatically)  or Implicit conversion :-
        // It is done automatically. It is safe because there is no chance to lose data.

        int a = 123;
        long b = a;

        // Narrowing Casting (manually) or Explicit conversion :- Data can loss.
        // It is not safe because there is chance of lossing the data.
        double c = 125.756;
        float f = (float) c;
    }
}
