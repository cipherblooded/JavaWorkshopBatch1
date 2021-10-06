package Lecture8.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Data_Structure {

    public static void main(String[] args) {

        // Queue stores the Data in FIFO fashion.
        // FIFO :- First In First Out. i.e. element which is inserted first will be removed first.

        Queue<Integer> queue = new LinkedList<>();

        // add():- It is used to add element at the last of the queue.
        // poll():- It is used to remove the element from the left side of the queue.
        // peek():- It is used to fetch the element from the left side of the queue.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of element to store in stack");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            queue.add(number);
        }

        System.out.println("-------------------");

        System.out.println("Initial queue is "+queue);
        System.out.println("Left Most Element In Queue "+queue.peek());

        for (int i = 0; i < n; i++) {
            int leftMostElementInQueue = queue.poll();
            System.out.println("Element removed from Queue is "+leftMostElementInQueue+" remaining values in Queue are "+ queue);
        }

    }
}
