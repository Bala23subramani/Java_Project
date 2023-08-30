package com.task;

public class Fountainpen extends Pen{
	public void write() {
		System.out.println("write the programe");
	}

	@Override
	public void refill() {
		System.out.println("Refill the ink");
		
	}
	
	public void changeNib() {
		System.out.println("change the nib from pen" );
	}
	public static void main(String[] args) {
		Fountainpen fp = new Fountainpen();
		fp.changeNib();
		fp.refill();
		fp.write();
	}
}


