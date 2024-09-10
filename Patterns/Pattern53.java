package Patterns;

public class Pattern53 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
