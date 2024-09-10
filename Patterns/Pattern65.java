package Patterns;

public class Pattern65 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        
        for(int i =1; i<=rows; i++){
            int num = 5;
        for(int j = i; j<=columns; j++){
                System.out.print(num+"  ");
                num --;
            }
            
            System.out.print("\n");
        }
    }
}
