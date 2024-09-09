package Arrays;

import java.util.Scanner;

public class Deleteion {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40 ,50};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements of an Array  before Deletion is ");

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the postion ");
        int pos = sc.nextInt();

        if (pos <= 0 || pos > n) {
            System.out.println("Invalid position.");
        } else {
            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; 

        System.out.println("Elements of an Array  after Deletion is ");

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
}
