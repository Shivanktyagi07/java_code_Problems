package Patterns;

public class Pattern56 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        char c = 'E';
    
        for(int i =1; i<=rows; i++){
            for(int j = 1; j<=columns; j++){
                System.out.print(c + " ");
                c--;
            }
            c ='E';
            System.out.print("\n");
        }
    }
}
