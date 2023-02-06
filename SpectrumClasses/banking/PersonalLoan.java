package SpectrumClasses.banking;

public class PersonalLoan extends Loan {

    public void checkLimit() {
        System.out.println("Limit exceeded!");
    }

    public PersonalLoan(int t, float rate, double p) {
        super(t, rate, p);
        this.tenure = t;
        this.interestRate = rate;
        this.principal = p;
    }
}
