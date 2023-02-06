// A self-dividing number is a number that is divisible 
// by every digit it contains. For example, 128 is a self-dividing 
// number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.
// Given two integers left and right, return a list of all the 
// self-dividing numbers in the range [left, right].

package LeetCode.Easy;

import java.util.*;

public class SelfDividingNumber { // 728
    public static List<Integer> selfDividingNumbers(int left, int right) { // Char implementation; LC runtime 6 ms
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            char arr[] = Integer.toString(i).toCharArray();
            boolean isDivisible = true;
            for (int j = 0; j < arr.length; j++) {
                int num = Character.getNumericValue(arr[j]);
                if (num == 0) {
                    isDivisible = false;
                    break;
                }
                if (i % num != 0)
                    isDivisible = false;
            }
            if (isDivisible)
                list.add(i);
            else
                isDivisible = true;
        }
        return list;
    }

    public static List<Integer> selfDividingNumbers2(int left, int right) { // Int implementation; LC runtime 3 ms
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean isDivisible = true;
            while (temp != 0) {
                int rem = temp % 10;
                if (rem == 0) {
                    isDivisible = false;
                    break;
                }
                if (i % rem != 0)
                    isDivisible = false;
                temp /= 10;
            }
            if (isDivisible)
                list.add(i);
            else
                isDivisible = true;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
