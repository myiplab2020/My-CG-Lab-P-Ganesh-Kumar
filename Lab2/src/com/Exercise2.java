package com;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = s.nextInt();
		String[] a = new String[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		String b[] = sortStrings(a);
		if(n%2==0) {
			for(int j=0;j<n/2;j++) {
				b[j]=b[j].toUpperCase();
			}
		}
		else {
			for(int j=0;j<=n/2;j++) {
				b[j]=b[j].toUpperCase();
			}	
		}
		System.out.println("The sorted Strings are : ");
		for(String i:b)
			System.out.println(i);
	}

}
