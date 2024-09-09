package Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {11, 42, 23, 56, 78, 32};
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest; 
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i]; 
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("The second highest number in the array is: " + secondHighest);
        }
    }
}
