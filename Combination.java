import java.util.Scanner;

public class Combination {
    public static int factorial(int num){
        int fact =1;
         for(int i =2; i<=num; i++){
            fact = fact*i;
         }
         return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();

        int combination = factorial(n)/( factorial(r) * factorial(n-r));

        System.out.println(combination);

        sc.close();
    }
}
