package com.cg.eis.exception;

import java.util.Scanner;

class Employee{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws EmployeeException {
		if(salary<=3000)
			throw new EmployeeException();
		else
			this.salary = salary;
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary of Employee : ");
		double sal = s.nextDouble();
		Employee e =new Employee();
		try {
			e.setSalary(sal);
		} catch (EmployeeException e1) {
			System.out.println(e1);
		}
		System.out.println(e.getSalary());

	}

}
