
package bank;


public class CheckingsAccount extends Customer{ //CheckingsAccount is the child of Customer(a customer owns a checkingsAccount)
	private double amount;
	CheckingsAccount chq = new CheckingsAccount(amount);
	System.out.println("Customer's checking's account discount"+chq.discount);  
	
	public double getAmount(){
	     return amount;
	}
	
	private CheckingsAccount(double amount){ //constructor with input amount
	}
	//public double get
	private boolean isAmountValid(double amount){
		if(amount>= 0){
			return true;
		} 
			return false;
	}
	public void depositToCheckings (double newAmount){//setter method=deposit
		double amount2 = amount;
		object.deposit(y);
	}
	Private double tax(double amount){
		amount = amount*(0.15);
		return amount;
	}
	public double withdraw(double newAmount){
		double Taxedamount =tax(newAmount);
		if((isAmountValid(newAmount)) &&(newAmount<amount)){
			amount=amount-newAmount-Taxedamount;
		}else{
			System.out.println("Insufficient balance");
		}
		balance=amount;
	    return balance;
	}
	
	private double transferFromCheqsToSavings(double amount){
	    	return amount;
	}
}
//balance public //
//tax called from withdraw


