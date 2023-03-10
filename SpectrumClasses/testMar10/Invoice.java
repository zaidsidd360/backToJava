package SpectrumClasses.testMar10;

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public double getPaymentAmount() {
		return this.pricePerItem * this.quantity;
	}

}
