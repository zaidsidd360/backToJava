package Strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the letter you want replaced: ");
        String toBeReplaced = sc.nextLine();
        System.out.print("Enter the you want " + toBeReplaced + " to be replaced with: ");
        String replacedWith = sc.next();
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == toBeReplaced.charAt(0)) {
                result += replacedWith.charAt(0);
            } else
                result += sentence.charAt(i);
        }

        System.out.println("The string with the replaced letter is: " + result);
    }
}
