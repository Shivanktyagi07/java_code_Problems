package Patterns;

public class Pattern90 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // int n =1;
            for (int j =  i; j <5; j++) {
                System.out.print(" ");
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            // ch++;
            System.out.println();
        }
    }
}
