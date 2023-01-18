//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

//LC HARD

package LeetCode;

public class MedianOfTwoArrays {
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

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static double findMedian(int arr[]) {
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (double) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }
    }

    public static void main(String args[]) {
        int nums1[] = { 1, 2, 3, 4 };
        int nums2[] = { 5, 6, 7 };
        int mergedNums[] = mergeTwoArrays(nums1, nums2);
        bubbleSort(mergedNums);
        System.out.println(findMedian(mergedNums));
    }
}
