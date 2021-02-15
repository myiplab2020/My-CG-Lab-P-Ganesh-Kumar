package com;

import java.util.Random;

class Person{
	private String name;
	private float age;
	Person(){
		
	}
	Person(String name,float age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}

class Account{
	Account(){
		setBalance(500);
		accNum = 10000 + new Random().nextInt(90000); 
	}
	Account(double balance){
		if(balance>=500) {
			this.setBalance(balance);
			accNum = 10000 + new Random().nextInt(90000);
		}
		else {
			System.out.println("The minimum balance should be above or equal to 500");
		}
	}
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double b) {
		if(b>0) {
		this.setBalance(b+getBalance());
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double d) {
		if(getBalance()>d) {
		this.setBalance(getBalance()-d);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

class SavingsAccount extends Account{
	final double minimumBalance = 500;
	@Override
	public void withdraw(double d) {
		if(getBalance()-minimumBalance>d) {
			this.setBalance(getBalance()-d);
		}
		else
			System.out.println("Impossible to withdraw given amount");
	}
}

class CurrentAccount extends Account{
	final double overdraftLimit = 5000;
	boolean b = false;
	public void withdraw(double d) {
		System.out.println(getBalance());
		if((d*3)<overdraftLimit)
			b = false;
		else 
			b = true;
	System.out.println("Overdraft limit reached : "+b);
	}
}

public class Exercise1 {
	
	public static void main(String[] args) {
		Person a1 = new Person("Smith",25);
		Person a2 = new Person("Kathy",23);
		Account smith= new Account(2000);
		Account kathy= new Account(3000);
		smith.setAccHolder(a1);
		kathy.setAccHolder(a2);
		smith.deposit(2000);
		kathy.withdraw(2000);
		double d1 = smith.getBalance();
		double d2 = kathy.getBalance();
		System.out.println("The updated balance of smith is : "+d1+"\n"
				+ "The updated balance of kathy is : "+d2 );
		
}
}
