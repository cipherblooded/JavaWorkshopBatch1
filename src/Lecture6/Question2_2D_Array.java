// Printing

// Input:
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 1 4 7
// 2 5 8
// 3 6 9

package Lecture6;
import java.util.Scanner;

public class Question2_2D_Array {

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

        for (int i = 0; i < noOfRows; i++) {
            for (int j = i; j < noOfColumns; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

        // Printing 2D array
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
