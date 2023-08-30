package com.bala;

import java.util.TreeSet;

public class Strrr {

	public static void main(String[] args) {
	
		TreeSet<Integer> Tr = new TreeSet<>();
		
		Tr.add(5);
		Tr.add(1);
		Tr.add(2);
		Tr.add(7);
		Tr.add(9);
		
		System.out.println(Tr.isEmpty());
		System.out.println(Tr.size());
		System.out.println(Tr.remove(2));
		System.out.println(Tr.last());
		System.out.println(Tr);
		for(int i=0; i<Tr.size(); i++) {
			System.out.println(Tr);
		}
		
}
}
