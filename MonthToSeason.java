import java.util.Scanner;

public class MonthToSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

       
        switch (month) {
            case 10: case 11: case 12: case 1:
                System.out.println("SUMMER");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("SPRING");
                break;
            case 6: case 7: case 8: case 9:
                System.out.println("RAINING");
                break;
            default:
                System.out.println("Invalid month.");
        }

        scanner.close();
    }
}
