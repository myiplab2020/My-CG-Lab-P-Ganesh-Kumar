package com;

import java.util.Scanner;

public class Exercise4 {

	public static int modifyNumber(int n) {
		char c,d;
		String s1,s2,s3;
		int m,m1,m2;
		String str = String.valueOf(n);
		int l = str.length();

		StringBuffer sb2 = new StringBuffer();
		for(int i=0;i<l-1;i++) {
			c = str.charAt(i);
			d = str.charAt(i+1);
			s1 = String.valueOf(c);
			s2 = String.valueOf(d);
			m1 = Integer.parseInt(s1);
			m2 = Integer.parseInt(s2);
			m = Math.abs(m1-m2);
			s3 = Integer.toString(m);
			sb2.append(s3);
		}
		sb2.append(str.charAt(l-1));
		String sb4 = sb2.toString();
		int result  = Integer.parseInt(sb4);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(modifyNumber(n));
	}

}
