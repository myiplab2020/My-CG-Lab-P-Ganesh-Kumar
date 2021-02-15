package com;

import java.util.Scanner;

public class Exercise6 {
	
	public static boolean positiveString(String s) {
		boolean b= false;
		int count = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)>s.charAt(i)) {
				count +=1;
			}
		}
		if(count==s.length()-1) {
			b = true;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(positiveString(str));
	}

}
