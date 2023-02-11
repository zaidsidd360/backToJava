// Given an integer num, repeatedly add all its digits 
// until the result has only one digit, and return it.

package LeetCode.Easy;

public class AddDigits { // 258
    public static int addDigits(int num) {
        if (num == 0)
            return 0;
        while (num >= 10) {
            num = nextSum(num);
        }
        return num;
    }

    public static int nextSum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 382;
        System.out.println(addDigits(num));
    }
}