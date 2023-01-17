package LeetCodeCOntest;

public class MergeTwoArrays {
    public static int[] mergeTwoArrays(int array1[], int array2[]) {
        int mergedArray[] = new int[array1.length + array2.length];
        int i;

        for (i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            mergedArray[i] = array2[j];
            i++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int mergedArray[] = mergeTwoArrays(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
