import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        
        scanner.close();
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);

        // int a = 0, b = 1, c;
        // for (int i = 2; i <= n; i++) {
        //     c = a + b;
        //     a = b;
        //     b = c;
        // }
        // return b;

    }

   
}
