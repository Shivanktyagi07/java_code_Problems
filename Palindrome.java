
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
         String input = scanner.nextLine();

         if(isPalindrome(input)){
            System.out.println(input + " is a palindrome");
         }
         else{
            System.out.println(input + " is not a palindrome");
         }

        scanner.close();
    }

    public static boolean isPalindrome(String str){
        int length = str.length();

        for(int i =0; i<length/2; i++){
            if(str.charAt(i) == str.charAt(length -1-i)){
                return true;
            }
        }
        return false;

    }
}

