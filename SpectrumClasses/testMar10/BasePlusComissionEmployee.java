package SpectrumClasses.testMar10;

public class BasePlusComissionEmployee extends ComissionEmployee {
	private double baseSalary;

	public double getPaymentAmount() {
		return this.comissionEmployeeSalary + this.baseSalary;
	}
}
