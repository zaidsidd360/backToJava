package SpectrumClasses.banking;

public class PersonalLoan {
    int tenure;
    float interestRate;
    double principal;

    public double calculateEMI() {
        return this.tenure * this.interestRate * this.principal;
    }

    public void checkLimit() {
        System.out.println("Limit exceeded!");
    }

    public PersonalLoan(int t, float rate, double p) {
        this.tenure = t;
        this.interestRate = rate;
        this.principal = p;
    }
}
