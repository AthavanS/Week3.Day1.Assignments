package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit");
}
public static void main(String[] args) {
	BankInfo bankinfo = new BankInfo();
	bankinfo.savings();
	bankinfo.fixed();
	bankinfo.deposit();
	
	AxisBank axisbank = new AxisBank();
	axisbank.deposit();
}
}
