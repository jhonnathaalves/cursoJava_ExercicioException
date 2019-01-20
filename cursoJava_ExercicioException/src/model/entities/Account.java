package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String Holder;
	private double balance;
	private double withdrawLimit;
	
	
	public Account() {
	}


	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		Holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return Holder;
	}


	public void setHolder(String holder) {
		Holder = holder;
	}


	public double getBalance() {
		return balance;
	}



	public double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit() {
		double deposit = 0.00;
		balance += deposit;
		
	}
	
	public void withdraw(double withdraw) throws DomainException {
		if(withdraw > balance ) {
			throw new DomainException("Not enough balance");
		} else if (withdraw > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		} else {
		balance -= withdraw;
		}
	}
	
	public String toString() {
		return "New balance: "+ balance; 
	}
}
