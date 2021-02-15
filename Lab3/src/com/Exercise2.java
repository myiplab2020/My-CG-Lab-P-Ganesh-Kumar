package com;

import java.util.Scanner;

public class Exercise2 {
	
	public static String getImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		sb.append("|");
		sb.append(s);
		StringBuffer sbr = new StringBuffer(sb.toString());
		sbr.reverse();
		return sbr.toString();
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(getImage(str));
	}

}
