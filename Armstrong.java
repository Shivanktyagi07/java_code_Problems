import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
         int number = input.nextInt();
        
         int num = number;
         int sum =0;
         int digits =0;

         int temp =number;
         while(temp>0){
            temp /= 10;
            digits++;
         }

         temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if(sum == num){
            System.out.println(number+" is an Armstrong Number");
        }
        else{
            System.out.println(number+" is not a Armstrong Number");
        }

        input.close();
    }
}
