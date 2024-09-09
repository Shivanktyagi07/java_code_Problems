package Arrays;

public class SumOfOdd {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66}; // Example array with elements
        int sum = 0;

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i] % 2 != 0) {  
                sum += arr[i];     
            }
        }

        System.out.println("Sum of odd numbers in the array is: " + sum);
    }
}
