package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.*;
public class Exercise2 {

	public static void main(String[] args) {
		String id,name,designation;
		double salary = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("1.Enter the employee details\n2.Display the employee details\n3.Get insurance scheme");
		System.out.println("Enter the choice you want : ");
		int n = s.nextInt();
		Service se = new Service();
		while(n!=0) {
		switch(n) {
		case 1:
			System.out.println("Enter employee id : ");
			id = s.next();
			System.out.println("Enter employee name : ");
			name = s.next();
			System.out.println("Enter employee salary : ");
			salary = s.nextDouble();
			System.out.println("Enter employee designation : ");
			designation = s.next();
			se.getEmpDetails(id, name, salary, designation);
			System.out.println("Employee details successfully updated.");
			break;	
		case 2:
			se.displayEmpDetails();
			System.out.println("Enter a choice : ");
			break;
		case 3:
			String fi = se.findInsurance(salary);
			System.out.println("The suitable insurance scheme was : "+fi);
			break;
		default :
			System.out.println("Enter a valid response");
			break;
		}
		System.out.println("1.Enter the employee details\n2.Display the employee details\n3.Get insurance scheme");
		System.out.println("Enter the choice you want : ");
		n = s.nextInt();
	 }
  }

}
