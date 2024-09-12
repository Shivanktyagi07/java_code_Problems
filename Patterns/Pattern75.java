package Patterns;

public class Pattern75 {
    public static void main(String[] args) {
       char ch ='A';
        
        for (int i = 5; i >= 1; i--) {
            // int  =1;
            for (int j =  i; j <5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(ch+" ");
                // ch++;
            }
            System.out.println();
        }
    }
}
