package com;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		System.out.println("Enter the text : ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count=count+1;
			}
		}
		System.out.println(count);

	}

}
