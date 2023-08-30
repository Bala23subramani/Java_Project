package com.bala;

public class BankB extends Bank {
	public void getBalance() {
		int balance = 150;
		System.out.println(balance);

	}
	
public static void main(String[] args) {
	BankB obj2= new BankB();
	obj2.getBalance();
	
}
}
