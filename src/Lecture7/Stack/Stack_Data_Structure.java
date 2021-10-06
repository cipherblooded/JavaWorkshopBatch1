package Lecture7.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Data_Structure {

    public static void main(String[] args) {

        // Queue stores the Data in LIFO fashion.
        // LIFO :- Last In First Out. i.e. element which is inserted at last will be removed first.

        Scanner scanner = new Scanner(System.in);

        // Declaration of stack in java
        Stack<Integer> stack = new Stack<>();

        // push():- it is used to insert the element in the stack
        // pop():- it is used to delete the element from the top of stack
        // peek():- it is used to display the top element of the stack

        System.out.println("Enter total number of element to store in stack");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        System.out.println("-------------------");

        System.out.println("Initial Stack is "+stack);

        System.out.println("Top element in stack "+stack.peek());

        for (int i = 0; i < n; i++) {
            int topElementOfTheStack = stack.pop();
            System.out.println("Element removed from stack is "+topElementOfTheStack+" remaining values in stack are"+ stack);
        }
    }
}
