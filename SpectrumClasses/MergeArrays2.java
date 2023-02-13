package SpectrumClasses;

public class MergeArrays2 {
    public static int[] mergeArrays2(int[] arr1, int[] arr2) {
        int res[] = new int[arr1.length + arr2.length];
        int j = arr2.length - 1;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            res[count] = arr1[i];
            count++;
            res[count] = arr2[j];
            count++;
            j--;
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 12, 14, 15, 19 };
        int b[] = { 7, 6, 9, 13, 17 };
        int ans[] = mergeArrays2(a, b);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
