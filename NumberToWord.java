import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
       
        String[] words = {"ZERO", "ONE", "TWO", "THREE", "FOUR", 
                          "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a single-digit number (0-9): ");
        int number = sc.nextInt();

        
        if (number >= 0 && number <= 9) {
            
            System.out.println(number + " -> " + words[number]);
        } else {
            
            System.out.println("Please enter a valid single-digit number (0-9).");
        }

       sc.close();
    }
}
