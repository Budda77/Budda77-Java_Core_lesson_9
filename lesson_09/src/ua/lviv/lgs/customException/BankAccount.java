package ua.lviv.lgs.customException;

public class BankAccount {
	
	private double balance;

	public BankAccount() {
		System.out.println("Thanks for creating account in our bank");
		System.out.println("Now your balance is " + balance);
	}
	
	public void makeDeposit(double amount) {
		balance += amount;
		System.out.println("You added " + amount + "$ to balance and now your balance is " + balance);
	}
	
	public void withdrawMoney(double amount) throws NoMoneyException {
		if(amount < balance) {
			balance -= amount;
			System.out.println("You withdraw " + amount + " $ from account, your balance is " + balance + "  $ ");
		    
		}else {
			double lackOfmoney = amount - balance;
			String message = "You tried to withdraw " + amount + " $ from account but your balance is insufficient for " + lackOfmoney + "  $ amount";
		    
			throw new NoMoneyException(message);
		
		}
	}
	
	

}
