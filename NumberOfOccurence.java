import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2};
        int count =0;
        System.out.println("Enter the number which you find the occurence of that number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            
                if (arr[i] == number) {
                   count++;
                }
            }
            System.out.println("Number " + number + " occurs " + count + " times in the array.");
            sc.close();
        }
    }

