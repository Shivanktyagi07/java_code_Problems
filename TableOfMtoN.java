import java.util.Scanner;

public class TableOfMtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number");
        int num2 =  sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }



        sc.close();
    }
}
