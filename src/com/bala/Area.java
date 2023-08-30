package com.bala;


public class Area {
	
	private void setDim() {
		int lenght=1;
		int breadth=2;
		System.out.println(+lenght);
		System.out.println(+breadth);
		
	}
	
	private void getArea() {
		int lenght=10;
		int breadth=20;
		System.out.println("Area:" +lenght*breadth);
		
	}
	
	public static void main(String[] args) {
		Area A= new Area();
		A.getArea();
		A.setDim();
				
	}
}
	



