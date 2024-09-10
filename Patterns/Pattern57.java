package Patterns;

public class Pattern57 {
 public static void main(String[] args) {
    int rows = 5;
    // int columns = 5;
    char ch = 'A';

    for(int i =0; i<=rows; i++){
        for(int j =0; j<=i; j++){
            System.out.print(ch+ " ");
        }
        ch++;
        System.out.println();
    }
 }
    
}