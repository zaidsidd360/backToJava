package SpectrumClasses.banking;

public class HomeLoan {
    int tenure;
    float interestRate;
    double principal;

    public double calculateEMI() {
        return this.tenure * this.interestRate * this.principal;
    }

    public void validateProperty() {
        System.out.println("Property is valid!");
    }

    public HomeLoan(int t, float rate, double p) {
        this.tenure = t;
        this.interestRate = rate;
        this.principal = p;
    }
}
