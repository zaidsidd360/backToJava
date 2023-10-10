package SpectrumClasses;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while(age <= 0) {
            try {
                age = takeAge();
            } catch (InvalidAgeException e) {
                System.out.println("Please enter an age greater than zero.");
            }
        }
        System.out.println(age);
    }

    public static int takeAge() throws InvalidAgeException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        if (age < 0) throw new InvalidAgeException("Age cannot be less than zero.");
        return age;

    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
