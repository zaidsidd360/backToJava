package SpectrumClasses;

public class WhileSeries {
    public static void printSeries(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 2;
            if (i == n)
                System.out.print(sum + ".");
            else
                System.out.print(sum + ", ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSeries(5);
    }
}
