package LeetCode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int digitsLenght = digits.length;
        int multiplyBy = (int) Math.pow(10, digitsLenght - 1);
        System.out.println(multiplyBy + "hi");
        int num = 0;
        for (int i = 0; i < digitsLenght; i++) {
            num += digits[i] * multiplyBy;
            System.out.println(num);
            multiplyBy = multiplyBy / 10;
        }
        num++;
        // Modification: Use temporary value for num and take each digit and add to
        // array.
        String numString = Integer.toString(num);
        int digitsPlusOne[] = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            digitsPlusOne[i] = Character.getNumericValue(numString.charAt(i));
        }
        return digitsPlusOne;
    }

    public static void main(String[] args) {
        int[] digits = { 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // Solution does not work for integers greater than 9 digits.
        int digitsPlusOne[] = plusOne(digits);
        for (int i = 0; i < digitsPlusOne.length; i++) {
            System.out.print(digitsPlusOne[i] + " ");
        }
    }
}
