package Arrays;

public class CopyEvenElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];

        System.out.println("Elemts of first Array :");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //copy elements from forst array to another array:
        for(int i =0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
         
        System.out.println(" EvenElememts of second array after copying is: ");
        for(int i =0; i<arr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
