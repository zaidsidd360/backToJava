package SpectrumClasses.oops;

public class Student {
	public int rollNumber;
	public String name;
	public double fees;
	public Address address;

	Student() {
		this.rollNumber = 100;
		this.name = "Name";
		this.fees = 10000.00;
	}

	Student(int r, String n, double f, Address ad) {
		this.rollNumber = r;
		this.name = n;
		this.fees = f;
		this.address = ad;
	}

	public void printDetails() {

	}

	public void payFees() {
		PayFeeUtility pf = new PayFeeUtility();
		pf.payFees(this.fees);
	}
}
