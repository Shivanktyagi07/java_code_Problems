import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7.");
        } else {
            System.out.println(number + " is not divisible by 7.");
        }

        sc.close();
    }
}