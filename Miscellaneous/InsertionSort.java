package Miscellaneous;

public class InsertionSort {
    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j + 1] < arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 3, 33, 2, 4 };
        int sortedarr[] = insertionSort(arr);
        for (int e : sortedarr) {
            System.out.println(e + " ");
        }
    }
}
