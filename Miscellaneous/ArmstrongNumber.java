// Design a class ArmNum to check if a given number is an Armstrong number or not. [A number is said to be Armstrong if sum of its digits raised to the power of length of the number is equal to the number] [10]
// Example:
// 371 = 33 + 73 + 13
// 1634 = 14 + 64 + 34 + 44
// 54748 = 55 + 45 + 75 + 45 + 85
// Thus, 371, 1634 and 54748 are all examples of Armstrong numbers.

package Miscellaneous;

public class ArmstrongNumber {
    public static boolean isArmNum(int num) {
        String numStr = Integer.toString(num);
        int numLen = numStr.length();
        int temp = num;
        int sumOfPower = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfPower += Math.pow(digit, numLen);
            temp = temp / 10;
        }
        return sumOfPower == num ? true : false;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 55000; i++) {
            if (isArmNum(i))
                System.out.print(i + "  ");
        }
    }
}