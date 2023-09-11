package SpectrumClasses;

public class Account {
	public String accNum;

	public Account(String a) {
		// TODO Auto-generated constructor stub
		this.accNum = a;
		System.out.println("Account");
	}
}

class SavingsAccount extends Account {

	public SavingsAccount(String a) {
		super(a);
		System.out.println("Savings Account");
		// TODO Auto-generated constructor stub
	}
}

class Main {
	public static void main(String[] args) {
		SavingsAccount sv = new SavingsAccount("342769767234");
		System.out.println(sv.accNum);
	}
}
