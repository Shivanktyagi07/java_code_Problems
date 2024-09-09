package Arrays;

public class SumOfElements {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum =0;
        System.out.println("Elements of an array :");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        for(int i =0; i<arr.length; i++){
            sum =sum+arr[i];
        }
        System.out.println("Sum of elements of an Array is : " + sum);

    }
}
