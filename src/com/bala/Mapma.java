package com.bala;

import java.util.Map;
import java.util.TreeMap;

public class Mapma {
	public static void main(String[] args) {
		
	
	Map<Object,String> ma = new TreeMap<>();
	
	ma.put(01, "Cow");
	ma.put(false, "Monkey");
	ma.put("Key", "Pig");
	ma.put(85.65, "Cat");
	ma.put(2.5, "Dog");
	
	System.out.println(ma);		
	System.out.println(ma.get(false));
	System.out.println(ma.containsKey(10));
	System.out.println(ma.containsValue("Pig"));
	
	

}

}