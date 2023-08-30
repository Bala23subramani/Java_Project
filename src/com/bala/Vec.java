package com.bala;

import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		
		Vector<Integer> vi = new Vector<>();
		vi.add(5);
		vi.add(7);
		vi.add(1);
		vi.add(9);
		
		vi.containsAll(vi);
		System.out.println(vi);
		System.out.println(vi.isEmpty());
		System.out.println(vi.capacity());
		System.out.println(vi.remove(2));
		
		
		
	}
}
