import java.util.Scanner;

public class FirstEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("The first " + n + " even numbers are:");

        
        for (int i = 0; i < n; i++) {
            if(i%2 == 0)
            System.out.print(i + " ");
            
        }

        sc.close();
    }
}
