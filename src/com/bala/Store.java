package com.bala;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0]=2;
		a[1]=6;
		a[2]=7;
		a[3]=9;
		a[4]=0;
		a[5]=12;
		a[6]=53;
		a[7]=56;
		a[8]=86;
		a[9]=21;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 10 integers:");
		int i= obj.nextInt();
		
		for(i=0; i< a.length; i++) {
			System.out.println(i);
		}
		
	}
}
