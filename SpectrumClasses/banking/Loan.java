package SpectrumClasses.banking;

public class Loan {
    int tenure;
    float interestRate;
    double principal;

    public double calculateEMI() {
        return this.tenure * this.interestRate * this.principal;
    }

    Loan(int t, float r, double p) {
        this.tenure = t;
        this.interestRate = r;
        this.principal = p;
    }
}
