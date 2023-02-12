// Given an integer num, return the number of digits 
// in num that divide num. An integer val divides nums 
// if nums % val == 0.

package LeetCode.Easy;

public class CountDigits { // 2520
    public static int countDigits(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            if (num % rem == 0)
                sum++;
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 2148;
        System.out.println(countDigits(num));
    }
}
