package Lecture6;

import java.util.Scanner;

public class Intro_2DArrays {

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

        // Printing 2D array
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
