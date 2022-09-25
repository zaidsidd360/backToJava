package Functions;

import java.util.Scanner;

public class AddTwoNum {
    public static int addTwoNum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int finalSum = addTwoNum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + finalSum);
    }
}
