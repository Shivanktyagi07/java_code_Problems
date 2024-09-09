package Arrays;


public class Factorial {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6}; 
        System.out.println("Elements and their factorials:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element: " + arr[i] + ", Factorial: " + factorial(arr[i]));
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; 
        }
        return fact;
    } 
}
