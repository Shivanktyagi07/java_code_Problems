import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number is: " + rev);
        sc.close();
    }
}
