import java.util.Scanner;

public class FirstnNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr any Number :");
        int n = sc.nextInt();

        for(int i =0; i<=n; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
