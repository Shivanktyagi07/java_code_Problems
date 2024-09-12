package Patterns;

public class Pattern83 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i =1; i<5; i++){
            for(int j=1; j<=i*2-1; j++){
                System.out.print(ch+"");
            }
            ch+=2;
            System.out.println();
        }
    }
}
