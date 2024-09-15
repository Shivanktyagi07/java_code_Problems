package Arrays;

public class ElementIsAvialable {
    
        public static boolean isElementPresent(int[] array, int element) {
            
            for (int num : array) {
                if (num == element) {
                    return true; 
                }
            }
            return false; 
        }
    
        public static void main(String[] args) {
            
            int[] array = {10, 20, 30, 40, 50};
            int element = 30;
    
            
            boolean result = isElementPresent(array, element);
    
           
            if (result) {
                System.out.println("Element " + element + " is present in the array.");
            } else {
                System.out.println("Element " + element + " is not present in the array.");
            }
        
    }
}
