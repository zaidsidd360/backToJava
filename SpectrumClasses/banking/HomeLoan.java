package SpectrumClasses.banking;

public class HomeLoan extends Loan {

    public void validateProperty() {
        System.out.println("Property is valid!");
    }

    public HomeLoan(int t, float rate, double p) {
        super(t, rate, p);
    }

    public void printDetails() {
        System.out.println("Tenure: " + tenure);
    }

    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan(2, 2.5f, 3.5);
        hl.printDetails();
    }
}
