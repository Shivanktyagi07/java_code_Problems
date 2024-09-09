package Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Elements of an Array is :");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which u find in this Array:");
        int key = sc.nextInt();

        boolean found = false;

        for(int i =0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println( key + " is present in this Array");
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println( key + " is not present in this Array.");
        }

        sc.close();
    }
}
