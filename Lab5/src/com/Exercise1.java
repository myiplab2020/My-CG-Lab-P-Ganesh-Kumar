package com;

import java.util.Scanner;

import com.sun.tools.sjavac.server.SysInfo;

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if(age<=15) {
			throw new AgeException();
		}
		else {
		this.age = age;
	}}
}

public class Exercise1 {

	public static void main(String[] args) {
		System.out.print("Enter the age of Person : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Person p = new Person();
		try {
			p.setAge(a);
		} catch (AgeException e) {
			System.out.println(e);
		}
		System.out.println(p.getAge());

	}

}
