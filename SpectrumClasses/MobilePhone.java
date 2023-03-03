package SpectrumClasses;

public class MobilePhone {
	int modelNumber;
	String modelName;

	public MobilePhone(String s, int n) {
		this.modelName = s;
		this.modelNumber = n;
	}

	@Override
	public boolean equals(Object m1) {
		MobilePhone that = (MobilePhone) m1;
		if (this.modelName == that.modelName && this.modelNumber == that.modelNumber)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return ("Model Name: " + this.modelName + "; Model Number: " + this.modelNumber);
	}

	public static void main(String[] args) {

		MobilePhone mp = new MobilePhone("Realme 6pro", 234423);
		MobilePhone mp2 = new MobilePhone("Realme 6pro", 234423);
		mp.toString();
		System.out.println(mp.equals(mp2));

	}

}
