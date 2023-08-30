package com.bala;

public class Name {
	
	public static void main(String[] args) {
		
		String st = "refrigerator";
		int a = st.length();
		System.out.println("length of the string: "+a);
		
		String st1 = "This is orange juicer";
		String st2 = "orange";
		System.out.println("The word 'orange' is present: " +st1.contains(st2));
		
		String st3 = "One, ";
		String st4 = "Two";
		System.out.println("Concatenate of two strings: "+st3.concat(st4));
		
		String st5 = "Hello, World";
		String st6 = "o";
		System.out.println("Occurence of the letter 'o': "+st5.indexOf(st6));
		System.out.println("Occurence of the character ',': "+st5.indexOf(','));
	}
}
