package Functions;

import java.util.Scanner;

public class SayHello {
    public static void sayhello(String name) {
        System.out.println("Hello, " + name + "!");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myname = sc.nextLine();
        sayhello(myname);
    }
}
