package LeetCodeCOntest;

public class GCD {
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

    public static int findGCD(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcd)
                    gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 6, 6, 7, 8 };
        int sortedArray[] = bubbleSort(arr);
        int largest = sortedArray[sortedArray.length - 1];
        int smallest = sortedArray[0];
        System.out.println(findGCD(smallest, largest));
    }
}
