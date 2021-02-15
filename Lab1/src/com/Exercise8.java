package com;

import java.util.Scanner;

public class Exercise8 {
	public static boolean checkNumber(int n) {
		 if (n == 0)
	            return false;
	         
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	}

	public static void main(String[] args) {
		System.out.print("Enter an integer number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean flag = checkNumber(n);
	       if(flag){
	           System.out.println("Number is a power of 2");
	       }else{
	           System.out.println("Number is a not power of 2");
	       }

	}

}
