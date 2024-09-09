public class SwapUsingThird {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Number before swapping is : " + num1 + "&" + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number after swapping is : " + num1 + "&" + num2);
    }
}
