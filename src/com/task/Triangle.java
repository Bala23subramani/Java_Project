package com.task;

public class Triangle extends Shape{
	 
@Override
    public int CalculatedArea() {
    	int base = 8;
        int height = 9;
    	return base*height;
    }
   public static void main(String[] args) {
	Triangle ti = new Triangle();
	ti.CalculatedArea();
}  
}
