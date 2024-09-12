package Patterns;

public class Pattern85 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            int num =1;
            for(int j =1; j<=i*2-1; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
