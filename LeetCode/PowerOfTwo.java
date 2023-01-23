//Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2^x.

package LeetCode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        int root = (int) Math.sqrt(n) + 1;
        for (int i = 0; i <= root; i++) {
            if (Math.pow(2, i) == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
