package com;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		System.out.print("Enter an integer number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int flag = 0;
		for(int i=3;i<n;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
			flag = 0;
		}
		

	}

}
