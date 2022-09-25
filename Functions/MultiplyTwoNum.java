package Functions;

import java.util.Scanner;

public class MultiplyTwoNum {
    public static int calculateProduct(int num1, int num2) {
        int prod = num1 * num2;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + prod);
    }
}
