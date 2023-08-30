package com.bala;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Check it is a Odd number or Even number");
		
		int n = obj.nextInt();
		if(n%2 == 0) {
			System.out.println("Even number");		
		}
		else {
			System.out.println("Odd number");
		}
		
	}
}
