package SpectrumClasses;

public class NumSearch {
    public static void findNum(int num, int arr[]) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("The value is present at index: " + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("Value out of range!");
    }

    public static void main(String[] args) {
        int arr[] = { 15, 25, 39, 37 };
        int valueToFind = 39;
        findNum(valueToFind, arr);
    }
}
