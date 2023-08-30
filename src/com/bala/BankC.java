package com.bala;

public class BankC extends Bank {
	public void getBalance() {
		int balance = 200;
		System.out.println(balance);

	}
	
public static void main(String[] args) {
	BankC obj3= new BankC();
	obj3.getBalance();
	
}

}
