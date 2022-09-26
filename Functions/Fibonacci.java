package Functions;

import java.util.Scanner;

public class Fibonacci {

    public static void fib(int num) {
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 1; i <= num; i++) {
            String punc = i == num ? ". " : ", ";
            System.out.print(firstNum + punc);
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The Fibonacci series upto " + num + " values is: ");
        fib(num);
    }
}
