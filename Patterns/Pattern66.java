package Patterns;

public class Pattern66 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        
        for(int i =1; i<=rows; i++){
            char ch = 'E';
        for(int j = i; j<=columns; j++){
                System.out.print(ch+"  ");
                ch--;
            }
            
            System.out.print("\n");
        }
    }
}