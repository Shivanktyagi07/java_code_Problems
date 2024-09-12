package Patterns;

public class Pattern70 {
    public static void main(String[] args) {
        int num = 5;
        char ch = 'A';
        
        for (int i = 1; i <= num; i++) {
            for (int j =  i; j <num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
