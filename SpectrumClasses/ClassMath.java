package SpectrumClasses;

class Maths {
    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public int prod(int a, int b) {
        return a * b;
    }

    public double quo(int a, int b) {
        return (double) a / b;
    }

    public int rem(int a, int b) {
        return a % b;
    }

}

public class ClassMath {
    public static void main(String[] args) {
        Maths m = new Maths();
        int sum = m.sum(2, 3);
        int diff = m.diff(2, 3);
        int prod = m.prod(2, 3);
        double quo = m.quo(7, 3);
        System.out.println("Sum: " + sum + ", " + "diff: " + diff + ", " + "prod: " + prod + ", " + "quo: " + quo);
    }
}
