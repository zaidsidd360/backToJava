package SpectrumClasses.oops;

public class Address {
	public String country;
	public String premisesNo;
	public String lane;
	public String city;
	public int pincode;

	Address(String pn, String co, String l, String ci, int p) {
		this.premisesNo = pn;
		this.country = co;
		this.lane = l;
		this.city = ci;
		this.pincode = p;
	}

	public void printAddress() {
		System.out.println("Address: " + this.premisesNo + ", " + this.lane + ", " + this.city + "-" + this.pincode
				+ ", " + this.country);
	}
}
