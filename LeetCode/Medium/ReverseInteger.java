// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside the signed 32-bit integer 
// range [-231, 231 - 1], then return 0. Assume the environment does not 
// allow you to store 64-bit integers (signed or unsigned).

package LeetCode.Medium;

public class ReverseInteger { // 07
    public static int reverse(int x) {
        long rev = 0; // required long since the reversed value could end up being outside the signed
                      // 32-bit integer range.
        int temp = Math.abs(x);
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (x < 0)
            rev *= -1;
        // if rev is outside the signed 32-bit integer range: return 0. Otherwise:
        // return the integer value of the reversed long value.
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
    }

    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(reverse(num));
    }
}
