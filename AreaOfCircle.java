

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        double  pi = 3.14;
     Scanner sc = new Scanner(System.in);

      System.out.println("Enter the radius of circle:");
      int r = sc.nextInt();
      double area = pi * r*r;
      System.out.println("Area of circle is " + area);
      sc.close();
    }
}
