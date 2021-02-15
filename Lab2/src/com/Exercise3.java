package com;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	
	public static int[] getSorted(int[] arr) {
		int l = arr.length;
		String[] s = new String[l];
		int b[] = new int[l];
		for(int i =0;i<l;i++) {
			s[i]=Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(s[i]);
			s[i]=sb.reverse().toString();
		}
		for(int j =0;j<l;j++) {
			b[j]=Integer.parseInt(s[j]);
		}
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of array : ");
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the numbers : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int a[] = getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
