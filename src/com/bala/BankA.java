package com.bala;

public class BankA extends Bank {
	public void getBalance() {
		int balance = 100;
		System.out.println(balance);

	}
	
public static void main(String[] args) {
	BankA obj1= new BankA();
	obj1.getBalance();
	
}

}
