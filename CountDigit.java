import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
         int number = input.nextInt();
        
        //  int num = number;
        //  int count =0;
         int digits =0;

         int temp =number;
         while(temp>0){
            temp /= 10;
            digits++;
         }

        //  temp = number;
        // while (temp > 0) {
        //     int digit = temp % 10;
           
        //     temp /= 10;
        // }
        System.out.println("Number of digits is "+ digits);

        input.close();
    }
}
