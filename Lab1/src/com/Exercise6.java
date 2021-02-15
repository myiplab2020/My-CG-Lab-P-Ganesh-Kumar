package com;

import java.util.Scanner;

public class Exercise6 {
	public static int calculateDifference(int n) {
		int a=0,b=0; int dif = 0;
		for(int i =1;i<=n;i++) {
			a = a+(i^2);
			b = b+i;
		}
		dif = a-(b^2);
		return dif;
	}

	public static void main(String[] args) {
		System.out.print("Enter an integer number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(calculateDifference(n));

	}

}
