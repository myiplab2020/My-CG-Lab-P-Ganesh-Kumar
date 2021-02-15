package com;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("1.Red"+"\n"+"2.Yellow"+"\n"+"3.Green");
		System.out.print("Enter Your Choice : ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Wait");
			break;
		case 3:
			System.out.println("Go");
			break;
		}

	}

}
