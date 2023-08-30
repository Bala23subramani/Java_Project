package com.bala;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character:");
		char ca=sc.next().charAt(0);
	if(ca=='a'|| ca=='e'|| ca=='i'|| ca=='o'||ca=='u'||ca=='s') {
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Not a vowel");
	}
}
}
