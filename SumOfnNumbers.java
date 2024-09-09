import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum =0;

        System.out.println("The Sum of numbers till " + n + "  are:");

        
        for (int i = 0; i < n; i++) {
           sum = sum+i;
        }
        System.out.print(sum + " ");   

        sc.close();
    }
}
