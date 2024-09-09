package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {11, 42, 23, 56, 78, 32}; 
        int min= arr[0]; 

      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }

        System.out.println("The minimum number in the array is: " + min);
    }
}
