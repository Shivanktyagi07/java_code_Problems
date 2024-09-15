package Arrays;

public class ThreeLargestNUmber {
    public static void main(String[] args) {
        int[] arr = {11, 42, 23, 56, 78, 32};  
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE; 

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) { 
                max3= max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
    
        System.out.println("Three largest elements are: " + max1 + ", " + max2 + ", " + max3);
    }
}
