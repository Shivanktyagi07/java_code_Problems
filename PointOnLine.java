import java.util.Scanner;

public class PointOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input s for point 1
        System.out.print("Enter x & y coordinate of point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Input  for point 2
        System.out.print("Enter x & y coordinate of point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Input coordinates for the third point
        System.out.print("Enter x & y coordinate of point 3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double slope = (y2 - y1) / (x2 - x1);

        if ((y3 - y1) / (x3 - x1) == slope) {
            System.out.println("The three points are on Line.");
        } else {
            System.out.println("The three points are not on Line.");
        }

        sc.close();
    }
}
