package SpectrumClasses.testMar10;

public class ComissionEmployee extends Employee {
	protected double grossSales;
	protected double comissionRate;
	protected double comissionEmployeeSalary = grossSales * comissionRate;

	public double getPaymentAmount() {
		return comissionEmployeeSalary;
	}
}
