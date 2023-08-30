package com.summa;

import java.util.Scanner;

public class Rougggg {
	public static void main(String[] arg) {
	
int[] numbers = new int[10];
        
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 integers:");

        
        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = scanner.nextInt();
        }
        
        
        System.out.println("The integers you entered are:");
        
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
		
		
}

