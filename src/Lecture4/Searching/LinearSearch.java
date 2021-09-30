package Lecture4.Searching;

public class LinearSearch {
    public static void main(String[] args) {

        // this array is hard coded, if you want then you can take the input from the user.
        // here we are skipping half of the array in each iteration, hence in the worst case we have to iterate the while loop (log base2(N)) times.
        // Complexity :- O(logbase2(N))

        int []arr = {50,20,40,60,10,30,90,70,80};

        int index = -1;

        int elementToSearch = 30;

        for (int i = 0; i < arr.length; i++) {
            if(elementToSearch==arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
