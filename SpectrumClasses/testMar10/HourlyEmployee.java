package SpectrumClasses.testMar10;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public double getPaymentAmount() {
		return wage * hours;
	}
}
