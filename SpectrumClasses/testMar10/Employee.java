package SpectrumClasses.testMar10;

public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private long adhaarNumber;

	public long getAdhaarNumber() {
		return this.adhaarNumber;
	}

	public void setAdhaarNumber(long newAdhaarNumber) {
		this.adhaarNumber = newAdhaarNumber;
	}

	public abstract double getPaymentAmount();
}
