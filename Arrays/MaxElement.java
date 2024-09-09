package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {11, 42, 23, 56, 78, 32};  
        int max = arr[0]; 

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("The highest number in the array is: " + max);
    }  
}
