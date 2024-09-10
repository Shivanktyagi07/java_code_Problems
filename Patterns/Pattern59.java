package Patterns;

public class Pattern59 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int num =1;
    
        for(int i =1; i<=rows; i++){
        for(int j = i; j<=columns; j++){
                System.out.print(num+"  ");
            }
            num++;
            System.out.print("\n");
        }
    }
}
