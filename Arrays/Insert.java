package Arrays;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of an Array");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of an Array before Insertion is : ");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();

        System.out.println("Enter the position to insert (1-based index):");
        int pos = sc.nextInt();

        // Check if the position is valid
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position.");
        } else {
            
            for (int i = n; i >= pos; i--)
             {
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = element;
            n++;

            System.out.println("Elements of an Array after Insertion is : ");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
}
