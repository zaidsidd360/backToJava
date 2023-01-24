package Miscellaneous;

public class BubbleSort {
    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 3, 33, 2, 4 };
        int sortedArray[] = bubbleSort(arr);
        for (int e : sortedArray) {
            System.out.println(e + " ");
        }
    }
}
