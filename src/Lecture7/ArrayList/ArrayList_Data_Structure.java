package Lecture7.ArrayList;

import java.util.ArrayList;

public class ArrayList_Data_Structure {
    public static void main(String[] args) {

        // Declaration of ArrayList in java
        ArrayList<Integer> arrayList = new ArrayList();

        // Adding elements to the arraylist
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(80);

        // Printing the whole arraylist
        System.out.println("The arraylist is: "+arrayList);

        // Adding an element at index 3
        arrayList.add(3,100);
        System.out.println("ArrayList after adding 100 at index 3: "+arrayList);

        // Fetching element at a particular index
        System.out.println("Element at 3rd index is: "+arrayList.get(3));

        // Printing the arraylist size
        int size = arrayList.size();
        System.out.println("The size of arraylist is: "+size);

        // Removing element at a particular index
        int val1 = arrayList.remove(0);
        System.out.println("Value removed at index 0 is: "+val1);
        System.out.println("ArrayList after removing element at index 0 is: "+arrayList);

        // Removing a particular value from an ArrayList
        Integer integer = 30;
        arrayList.remove(integer);
        System.out.println("ArrayList after removing 30 is: "+arrayList);

        // Changing the element at index 3
        arrayList.set(3,200);
        System.out.println("ArrayList after changing value at index 3 is: "+arrayList);

        // Iterating over an ArrayList using foreach loop
        for (Integer i : arrayList) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Iterating over an ArrayList using for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();

        // Emptying an arraylist
        arrayList.clear();
        System.out.println("ArrayList after using clear function: "+arrayList);



    }
}
