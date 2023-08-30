package com.bala;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.containsAll(ll);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(4));
		System.out.println(ll.size());
		System.out.println(ll.remove(3));
	}
}
