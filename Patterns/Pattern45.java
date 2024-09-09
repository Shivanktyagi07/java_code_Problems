package Patterns;

public class Pattern45 {
    public static void main(String[] args) {
        
            int rows = 5;
            int columns = 5;
        
            for(int i =1; i<=rows; i++){
            for(int j = i; j<=columns; j++){
                    System.out.print(" * ");
                }
                System.out.print("\n");
            }
       
    }
}
