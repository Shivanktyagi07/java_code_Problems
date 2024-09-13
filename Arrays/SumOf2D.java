package Arrays;

public class SumOf2D {
    public static int calculateSum(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int totalSum = calculateSum(matrix);
        System.out.println("The sum of all elements in the matrix is: " + totalSum);
    }
}