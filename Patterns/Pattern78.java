package Patterns;

public class Pattern78 {
    public static void main(String[] args) {
        int num = 5;
        
        for (int i = 1; i <= 5; i++) {
            // int n =1;
            for (int j =  i; j <num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*"+" ");
                // n++;
            }
            System.out.println();
        }
    }
}
