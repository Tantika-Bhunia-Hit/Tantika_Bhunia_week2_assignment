package Assignment2;

public class BankAccount {
	
	 private double balance;
	 public void BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	 
	 }
	 
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }
	 public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount!");
	        }
	    }
	  public void displayBalance() {
	        System.out.println("Current Balance: $" + balance);
	    }
	}

