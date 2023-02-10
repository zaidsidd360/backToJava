package SpectrumClasses;

// Given an array of salaries, calculate the average salary.

public class AvgSalary {
    public static double calculateAvgSalary(double salaries[]) {
        double sumOfSalaries = 0;
        for (double salary : salaries) {
            sumOfSalaries += salary;
        }
        double avgSalary = sumOfSalaries / salaries.length;
        return avgSalary;
    }

    public static void main(String[] args) {
        double salaries[] = { 19000.00, 23500.00, 34000.00, 79000.00 };
        System.out.println(calculateAvgSalary(salaries));
    }
}
