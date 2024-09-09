import java.util.Scanner;

public class SumOfEven {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of odd numbers to print
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The SUm of even Numbers till " + n + " are:");

        // Print the first n odd numbers
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){ 
            sum = sum + i;
            }
        }
        System.out.print(sum + " ");

        sc.close();
    }
}
