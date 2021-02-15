package com.cg.eis.bean;

public class Employee {
	public String id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	enum insuranceScheme{
		Scheme1,Scheme2,Scheme3,Scheme4;
	}
}
