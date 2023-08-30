package com.task;

public class Human extends Monkey implements Basicanimal{

	@Override
	public void eat() {
		System.out.println("eating apple");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping on bed");
		
		
	}
public static void main(String[] args) {
	Human hu= new Human();
	hu.eat();
	hu.sleep();
	
}
}
