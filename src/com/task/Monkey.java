package com.task;

public class Monkey {
private void jump() {
	System.out.println("Jump from tree");

}
private void bite() {
	System.out.println("bite apple");

}
public static void main(String[] args) {
	Monkey mp = new Monkey();
	mp.jump();
	mp.bite();
}
}
