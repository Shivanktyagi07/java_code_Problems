package Patterns;

public class Pattern54 {
    public static void main(String[] args) {
        int num = 5;
        int numLines = 5;

        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num--;
        }
    }
}
