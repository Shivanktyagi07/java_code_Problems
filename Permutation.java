import java.util.Scanner;

public class Permutation {

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

        int premutation = factorial(n)/factorial(-n-r);

        System.out.println(premutation);

        sc.close();
    }
}
