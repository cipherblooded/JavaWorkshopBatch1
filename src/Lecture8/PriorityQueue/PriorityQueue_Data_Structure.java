package Lecture8.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Data_Structure {

    public static void main(String[] args) {

        // Internally priority queue implements Heap Data Structure.

        // add():- It is used to add an element in the priority queue.
        // poll():- It is used to remove an element from the priority queue.
        // peek():- It is used to fetch an element from the priority queue.

        // Min Heap implementation
        // Declaration of PriorityQueue in java
        PriorityQueue<Integer> pQMin= new PriorityQueue<>();

        pQMin.add(9);
        pQMin.add(5);
        pQMin.add(8);
        pQMin.add(1);
        pQMin.add(3);
        pQMin.add(7);
        pQMin.add(10);

        System.out.println("Initial MinHeap is "+pQMin);

        for (int i = 0; i < 7; i++) {
            int element = pQMin.poll();
            System.out.println("Value removed "+element+" remaining values in min heap are "+pQMin);
        }

        System.out.println("------------------------------");

        // Max heap implementation
        // Declaration of PriorityQueue in java
        PriorityQueue<Integer> pQMax = new PriorityQueue<>(Collections.reverseOrder());

        pQMax.add(9);
        pQMax.add(5);
        pQMax.add(8);
        pQMax.add(1);
        pQMax.add(3);
        pQMax.add(7);
        pQMax.add(10);

        System.out.println("Initial MaxHeap is "+pQMax);

        for (int i = 0; i < 7; i++) {
            int element = pQMax.poll();
            System.out.println("Value removed "+element+" remaining values in max heap are "+pQMax);
        }

    }
}
