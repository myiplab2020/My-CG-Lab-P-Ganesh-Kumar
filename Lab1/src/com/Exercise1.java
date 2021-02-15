package com;
import java.io.*;
import java.util.Scanner;
public class Exercise1 {
	
	public void cubes(int n){
		int sum = 0;
		while(n>0) {
			sum = sum+((n%10)*(n%10)*(n%10));
			n = n/10;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Exercise1 obj = new Exercise1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		obj.cubes(n);
		
	}

}
