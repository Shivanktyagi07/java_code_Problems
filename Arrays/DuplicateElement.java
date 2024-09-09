package Arrays;

// import java.lang.reflect.Array;

//if we have sorted Array:
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2};

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

// if Array is not Sorted:
// public class DuplicateElement {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 3, 2};

//         //  first sort array using any sorting Algortihm 

//         System.out.println("Duplicate elements are:");
// //        for (int i = 1; i < arr.length; i++) {
//     if (arr[i] == arr[i - 1]) {
//         System.out.println(arr[i]);
//     }
//     }
// }