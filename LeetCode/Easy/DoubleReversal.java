// Reversing an integer means to reverse all its digits.
// For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the 
// leading zeros are not retained. Given an integer num, reverse num to get reversed1, 
// then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.

package LeetCode.Easy;

public class DoubleReversal { // 2119
    public static boolean isSameAfterReversals(int num) {
        if (num == 0)
            return true;
        int temp = num;
        int rev1 = reverse(temp);
        int rev2 = reverse(rev1);
        return rev2 == num;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversals(num));
    }
}
