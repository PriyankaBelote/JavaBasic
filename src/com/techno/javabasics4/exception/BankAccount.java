package com.techno.javabasics4.exception;

public class BankAccount {
	double balance;

	public BankAccount(double money) {
		balance = money;
	}

	public void withdraw(double amount){
		if (this.balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println("amount debited :" + amount);
			System.out.println("remaining amount :" + this.balance);
		} else {
			throw new InsufficientException("insufficient amount");
		}
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		try {
			bankAccount.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}