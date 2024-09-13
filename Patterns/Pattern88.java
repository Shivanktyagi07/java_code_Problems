package Patterns;

public class Pattern88 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // int n =1;
            for (int j =  i; j <5; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >=1 ; k--) {
                System.out.print(k+" ");
                // n++;
            }
            // ch++;
            System.out.println();
        }
    }
}
