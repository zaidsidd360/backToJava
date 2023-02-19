/*
Given a fixed-length integer array arr, duplicate each 
occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. 
Do the above modifications to the input array in place and do not return anything.
*/

package LeetCode.Easy;

public class DuplicateZeros { // 1089
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int j = arr.length - 2;
                while (j > i) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
