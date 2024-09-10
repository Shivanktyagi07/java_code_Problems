package Patterns;
 public class Pattern52 {
  public static void main(String[] args) {
    int rows = 5;
        int columns = 5;
        char c = 'A';
    
        for(int i =1; i<=rows; i++){
            for(int j = 1; j<=columns; j++){
                System.out.print(c + " ");
                c++;
            }
            c ='A';
            System.out.print("\n");
        }
  }
    
}