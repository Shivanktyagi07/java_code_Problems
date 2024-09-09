package Arrays;

public class Prime {
    public static void main(String[] args) {
        int[] arr = {11, 18, 23, 25, 29, 35};  
        System.out.println("Checking if array elements are prime or not:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a prime number.");
            } else {
                System.out.println(arr[i] + " is not a prime number.");
            }
        }
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i < n; i++) { 
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
