package SpectrumClasses;

public class Peaks {
    public static void printPeaks(double arr[]) {
        double t;
        int i = 0;
        int j = i + 1;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("Smallest: " + arr[0] + " Largest: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        double array[] = { 203.0, 46.0, 79.0, 84.0, 109.0 };
        printPeaks(array);
    }
}