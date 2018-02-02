package bank;

interface Transactions{
	public void deposit (double newAmount);
	public Double withdraw (double newAmount);
}
public class BankAccount implements Transactions{ //CheckingsAccount is the child of Customer(a customer owns a checkingsAccount)
	private double amount;
	CheckingsAccount chq = new CheckingsAccount(amount);
	System.out.println("Customer's checking's account discount"+chq.discount);  
	
	public double getAmount(){
	     return amount;
	}
	
	 public BankAccount(){
      		balance = 0;
         }

   	public BankAccount(double initialAmount){//constructor with input amount
      		amount = initialAmount;
	}
	public void deposit (double newAmount){//setter method=deposit
		if(isAmountValid(newAmount)){
			double newBalance = balance + amount; 
			balance = newBalance;
		}
	}
	
	public double withdraw(double newAmount){
		double Taxedamount =tax(newAmount);
		if((isAmountValid(newAmount)) &&(newAmount<amount)){
			amount=amount-newAmount-Taxedamount;
			//double newBalance = balance - amount;
      			//balance = newBalance;
		}else{
			System.out.println("Insufficient balance");
		}
		balance=amount;
	    return balance;
	}
	//public double get
	private boolean isAmountValid(double amount){
	//try{ amount}catch(ArithmeticException e){System.out.println(e);}  	
		if(amount>= 0){
			return true;
		}
	
			return false;
	}
	
	Private double tax(double amount){
		amount = amount*(0.15);
		return amount;
	}
	
	
	private double transferFromCheqsToSavings(double amount){
	    	return amount;
	}
}
//balance public //
//tax called from withdraw
//will change later deposit

  
