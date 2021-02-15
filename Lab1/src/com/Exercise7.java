package com;

import java.util.Scanner;

public class Exercise7 {
	
	public static boolean checkNumber(int number) {
	       boolean flag = false;
	       int currentDigit = number % 10;
	       number = number/10;
	        
	       while(number>0){
	           if(currentDigit <= number % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = number % 10;
	           number = number/10;
	       }
	       return flag;
	}

	public static void main(String[] args) {
		System.out.print("Enter an integer number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean flag = checkNumber(n);
	       if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }

	}

}
