package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] array) {
        int n = array.length;

      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (array[i] == array[j]) {
                    
                    for (int k = j; k < n - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    
                    n--;
                    j--; 
                }
            }
        }
        return n; 
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 3};
        
        System.out.println("Original Array: " + Arrays.toString(array));

        int newSize = removeDuplicates(array);
        
        int[] result = Arrays.copyOf(array, newSize);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}

