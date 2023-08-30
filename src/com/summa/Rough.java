package com.summa;

import java.util.Scanner;

public class Rough {
	
	public static void main(String[] arg) {
		
		    		      
		        Scanner scanner = new Scanner(System.in);
		        
		        int[] numbers = new int[20];
		        int positiveCount = 0;
		        int negativeCount = 0;
		        int oddCount = 0;
		        int evenCount = 0;
		        int zeroCount = 0;
		        
		        System.out.println("Enter 20 integers:");
		        	       
		        for (int i = 0; i < numbers.length; i++) {
		           
		            numbers[i] = scanner.nextInt();
		            
		            if (numbers[i] > 0) {
		                positiveCount++;
		            } else if (numbers[i] < 0) {
		                negativeCount++;
		            }
		            
		            if (numbers[i] % 2 == 0) {
		                evenCount++;
		            } else {
		                oddCount++;
		            }
		            
		            if (numbers[i] == 0) {
		                zeroCount++;
		            }
		        }
		        		       
		      		        
		        System.out.println("Number of positive numbers: " + positiveCount);
		        System.out.println("Number of negative numbers: " + negativeCount);
		        System.out.println("Number of odd numbers: " + oddCount);
		        System.out.println("Number of even numbers: " + evenCount);
		        System.out.println("Number of zeros: " + zeroCount);
		    }
		

}