package Arrays;

public class AvgOfElements {
    public static void main(String[] args){
        // int arr[] = new int[5];
         int arr[] = {11,21,31,41,51};
         int sum =0;
         double avg;
         System.out.println("Array elemnts are :");

         for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
         }
         
        
         //Avg of elements of an ARRAY:
         for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
         }

         avg = sum /5;
         System.out.println("Sum of elements of an Array is : " + sum);

         System.out.println("Average of an elements of an above array is : " + avg);
    }
}

