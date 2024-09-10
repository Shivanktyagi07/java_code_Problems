package Patterns;

public class Pattern63 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        
        int num = 5;
        for(int i =1; i<=rows; i++){
        for(int j = columns; j>=i; j--){
                System.out.print(num+"  ");
            }
            num--;
            
            System.out.print("\n");
        }
    }
}
