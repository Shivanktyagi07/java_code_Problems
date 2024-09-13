package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
         int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Enter the elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

       
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
    }

