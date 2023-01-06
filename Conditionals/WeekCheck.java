package Conditionals;

public class WeekCheck {

    public static int getLargest(int[] arr) {
        int currentLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > currentLargest) {
                currentLargest = arr[i];
            }
        }
        return currentLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 4, 9, 2 };
        System.out.println("The largest number is: " + getLargest(arr));
    }
}
