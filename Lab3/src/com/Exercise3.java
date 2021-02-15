package com;

import java.util.Scanner;

public class Exercise3 {
	
	public static String alterString(String s) {
		//StringBuffer sb  = new StringBuffer();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='a'&& ch[i]!='A'&& ch[i]!='e'&& ch[i]!='E'&&ch[i]!='i'&&ch[i]!='I'&&
					ch[i]!='o'&&ch[i]!='O'&&ch[i]!='u'&&ch[i]!='U') {
				if(ch[i]=='z')
					ch[i]='b';
				if(ch[i]=='Z')
					ch[i]='B';
				ch[i] = (char) (ch[i]+1);
				
			}
		}
		String str = new String(ch);
		return str;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String se = s.next();
		System.out.println(alterString(se));
	}

}
