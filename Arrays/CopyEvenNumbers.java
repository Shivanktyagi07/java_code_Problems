package Arrays;

import java.util.ArrayList;

public class CopyEvenNumbers {

    public static int[] copyEvenNumbers(int[] sourceArray) {
        ArrayList<Integer> evenNumbers = new ArrayList<>(); 
        
        for (int num : sourceArray) {
            if (num % 2 == 0) {
                evenNumbers.add(num); 
            }
        }

        int[] evenArray = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenArray[i] = evenNumbers.get(i);
        }

        return evenArray; 
    }

    public static void main(String[] args) {
        
        int[] sourceArray = {10, 15, 22, 31, 44, 55, 60, 71};

        // Copy even numbers to a new array
        int[] evenArray = copyEvenNumbers(sourceArray);

        // Print the new array with even numbers
        System.out.println("Even numbers in the new array:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }
}
