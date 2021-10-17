// Printing

// Input:
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 1 4 7 8 5 2 3 6 9

package Lecture6;
import java.util.Scanner;

public class Question1_2D_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter no of Rows");
        int noOfRows = scanner.nextInt();
        System.out.println("Please enter no of Columns");
        int noOfColumns = scanner.nextInt();

        // Declaration of 2D array in java
        // Syntax: DataType [][] variable name = new DataType [no of rows][no of columns]
        int [][]arr = new int[noOfRows][noOfColumns];

        System.out.println("Please enter 2D array");

        // Taking input in 2D array
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < noOfColumns; i++) {
            if(i%2==0){
                for (int j = 0; j < noOfRows; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }else {
                for (int j = noOfRows-1; j>=0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
