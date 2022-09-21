// IF ELSE 

package Conditionals;

import java.util.*;

public class CheckOddEven {
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else
            System.out.println(num + " is an odd number.");
    }
}

// OUTPUT
// Enter a number: 33
// 33 is an odd number.