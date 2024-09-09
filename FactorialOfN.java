import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int fact=1;
        
        for(int i =1; i<=n; i++){
             fact =1;
            for(int j =2; j<=i; j++){
                fact = fact * j;
            }
            
            System.out.println("Factorial of number " + i + " is " + fact);
        
            }
        

        sc.close();
    }
}

