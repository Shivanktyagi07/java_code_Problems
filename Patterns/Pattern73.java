package Patterns;

public class Pattern73 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'E';
        for(int i =0; i<=rows; i++){
            for(int j =5; j>=i; j--){
                System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
}
