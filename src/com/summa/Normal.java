package com.summa;

public class Normal extends Ipt_Abs {

	public Normal(int a, int b) {
		super(a, b);
		int c = a+b;
		System.out.println(+c);
		
	}
public static void main(String[] args) {
	Normal n = new Normal(1, 2);
}
	
}
