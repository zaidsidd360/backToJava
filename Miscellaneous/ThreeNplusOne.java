package Miscellaneous;

public class ThreeNplusOne {
    public static int calcIterations(int n) {
        int i = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n) + 1;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int iterations = calcIterations(97);
        System.out.println(iterations);
    }
}