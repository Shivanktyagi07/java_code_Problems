package Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr [] = {1,6,4,5,3,2};
        int n = arr.length;
        System.out.println("Elements are :");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("Elements after sorting is:");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
