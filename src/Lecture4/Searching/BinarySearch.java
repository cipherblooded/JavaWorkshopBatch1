package Lecture4.Searching;

public class BinarySearch {
    public static void main(String[] args) {

        // this array is hard coded, if you want then you can take the input from the user.
        // here we are checking each and every element of the array hence in the worst case we have to traverse all the elements in the array.
        // Complexity :- O(n)

        int []arr = {10,20,30,40,50,60,70,80,90};
        int elementToSearch = 30;
        int index = -1;

        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==elementToSearch){
                index = mid;
                break;
            }else if(arr[mid]<elementToSearch){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        System.out.println(index);
    }
}
