import java.util.Scanner;

public class AverafeOfFiveSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            sum += marks;
        }

        double average = sum / 5;

        System.out.println("Average marks: " + average);

        sc.close();
    }
}
