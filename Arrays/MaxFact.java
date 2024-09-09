package Arrays;

public class MaxFact {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};  
        int max = arr[0]; 

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("The Largest number in the array is: " + max);
        long fact =1;
        for(int i=2; i<=max; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of " + max + " is " + fact);
    }  
}
