package com;

import java.util.Scanner;

class Employee{
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName)throws NameException {
		if(firstName.isEmpty())
			throw new NameException();
			
		else
			this.firstName = firstName;
			
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName)throws NameException {
		if(lastName.isEmpty())
			throw new NameException();
		else
			this.lastName = lastName;
			
	}
	private String lastName;

}

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String str1 = s.nextLine();
		System.out.println("Enter Second Name : ");
		String str2 = s.nextLine();
		Employee e = new Employee();
		try {
			e.setFirstName(str1);
		} catch (NameException e1) {
			System.out.println(e1);
		}
		try {
			e.setLastName(str2);
		} catch (NameException e2) {
			System.out.println(e2);
		}
		System.out.println(e.getFirstName()+" "+e.getLastName());

	}

}
