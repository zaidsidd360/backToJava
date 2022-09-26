package Functions;

import java.util.Scanner;

public class PowerRaiser {

    public static double raisePower(int num, int pow) {
        double value = Math.pow(num, pow);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();
        double value = raisePower(num, pow);
        System.out.println(value);
    }
}