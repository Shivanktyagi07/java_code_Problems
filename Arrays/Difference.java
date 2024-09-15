package Arrays;

public class Difference {
    public static void main(String[] args) {
        int[] arr = {11, 42, 23, 56, 78, 32};  
        int max = arr[0]; 
        int min = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }

            if (arr[i] < min) {
                min = arr[i]; 
            }
        }

        System.out.println("The highest number in the array is: " + max);
        System.out.println("The smallest number in the array is: " + min);

        int diff = max - min;
        System.out.println("The difference between the is "+diff);
    }  

    }

