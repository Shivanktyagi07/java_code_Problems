import java.util.Scanner;

public class FirstOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of odd numbers to print
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("The first " + n + " odd numbers are:");

        // Print the first n odd numbers
        for (int i = 0; i < n; i++) {
            if(i%2 != 0)
            System.out.print(i + " ");
            
        }

        sc.close();
    }
}
