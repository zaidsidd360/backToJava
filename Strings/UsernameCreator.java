package Strings;

import java.util.Scanner;

public class UsernameCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your e-mail: ");
        String email = sc.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Your username is: " + username);
    }
}
