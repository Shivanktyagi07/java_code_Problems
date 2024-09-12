package Patterns;

public class Pattern82 {
    public static void main(String[] args) {
        int num = 5;
        char ch ='A';
        for (int i = 1; i <= 5; i++) {
            // int n =1;
            for (int j =  i; j <num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i*2-1 ; k++) {
                System.out.print(ch+" ");
                // n++;
            }
            ch++;
            System.out.println();
        }
    }
}
