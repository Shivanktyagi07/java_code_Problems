package Patterns;

public class Pattern68 {
    public static void main(String[] args) {
        
        int num = 5;
        
        for (int i = 1; i <= num; i++) {
            for (int j =  i; j <num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(i+" ");
            }
           
            System.out.println();
        }
    }
}
