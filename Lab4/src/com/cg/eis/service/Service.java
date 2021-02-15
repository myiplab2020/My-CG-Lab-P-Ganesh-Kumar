package com.cg.eis.service;
import com.cg.eis.bean.*;

interface EmployeeService{
	void getEmpDetails(String id,String name,double salary,String designation);
	void displayEmpDetails();
	String findInsurance(double salary);
}
public class Service implements EmployeeService {
	Employee e = new Employee();

	@Override
	public void getEmpDetails(String id,String name,double salary,String designation) {
		e.id = id;
		e.name = name;
		e.salary = salary;
		e.designation = designation;
	}

	@Override
	public void displayEmpDetails() {
		System.out.println("Id : "+e.id+"\n"
				+"Name : "+e.name+"\n"
				+"Salary : "+e.salary+"\n"
				+"designation : "+e.designation+"\n");
		
	}

	@Override
	public String findInsurance(double salary) {
		if(e.salary<=30000)
			return "Scheme1";
		else if(e.salary>30000 && e.salary<=60000)
			return "Scheme2";
		else if(e.salary>60000 && e.salary<=100000)
			return "Scheme3";
		else
			return "Scheme4";	
	}

}
