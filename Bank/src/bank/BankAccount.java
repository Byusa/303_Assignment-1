//package pinmain;
/*File Name: BankAccount.java
Developers: <<Serge Jabo Byusa>>
Purpose: << This is where all the banks are kept and where all the transaction are made>>
Inputs: <<None>> 
Outputs: <<None>> 
Modifications
==========
<<S.B.J>> <<29th Jan>> <<created and made a inputValidation() method better>>*/

package bank;

interface Transactions{
	float rateOfInterest(); //added
        float chargeRate();
	void deposit (double newAmount);
	double withdraw (double newAmount);
}
public abstract class BankAccount { //CheckingsAccount is the child of Customer(a customer owns a checkingsAccount)//implements Transactions
  private double balance;
  private int accountNumber;
  //static cause it is shared by all customers
  private static int lastAccountNumber = 260600000;

    public BankAccount(double intialBalance,int accountNumber){
        if(intialBalance>0){
            balance = intialBalance;
            accountNumber = lastAccountNumber + 1;
            lastAccountNumber = accountNumber;
        }else{
            balance=0;
        accountNumber = lastAccountNumber + 1;
        lastAccountNumber = accountNumber;}
    }
    public BankAccount(){
        if(balance>0){
            this.balance = balance;
            this.accountNumber = lastAccountNumber + 1;
            this.lastAccountNumber = accountNumber;
        }else{
            this.balance=0;
        this.accountNumber = lastAccountNumber + 1;
        this.lastAccountNumber = accountNumber;}
    }
    public boolean deposit(double depositAmount){
        if(depositAmount<0){
            System.out.println("Invalid Input, there is no negative money talk to our loan system!!!");
            return false;
        }else{
          balance += depositAmount;
          return true;
        }
    }
    public boolean withdraw(double withdrawAmount){
        if (withdrawAmount > balance){    
            System.out.println("Sorry, Insufficient Funds!!!");
            return false;
        }else if(withdrawAmount<0){
            System.out.println("Invalid Input, there is no negative money talk to our loan system!!!");
            return false;
        } else {
            balance -= withdrawAmount;
            return true;
        }
    }
    private boolean isAmountValid(double amount){
		if(amount>= 0){
			return true;
		} 
			return false;
	}
    public int getaccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    public boolean transfer(double amountToTransfer, BankAccount secondAccount) {
	boolean withdrawalSuccessful = this.withdraw(amountToTransfer);	//first withdraw the money from the bank account
	if(!(withdrawalSuccessful)) {		//if withdrawal is unsuccessful return false
		return false;
	}
	boolean transferSuccessful = secondAccount.deposit(amountToTransfer);
		
	if(transferSuccessful)		//if the deposit to second account was successful return true
		return true;
	else
		return false;			//otherwise false;
}
	
  public abstract String getType();
}
/*  
        
        
        public double withdraw(double newAmount){ //getter
		double Taxedamount =tax(newAmount);
		if((isAmountValid(newAmount)) &&(newAmount<amount)){
			amount=amount-newAmount-Taxedamount;
			//double newBalance = balance - amount;
      			//balance = newBalance;
		}else{
			System.out.println("Insufficient balance");
		}
		double balance=amount;
	    return balance;
	}
        
         public void deposit (double newAmount){//setter method=deposit
		if(isAmountValid(newAmount)){
			double newBalance = balance + amount; 
			balance = newBalance;
		}
	}
        
   
        
        
       
        
        private boolean isAmountValid(String input){
		
	if(amount>= 0){
		return true;
	} 
		return false;
    }
        
        
        */
        
        
        
        
        
        
        
        
    
	
	
	 
	
	
	/*
	//public double get
	private boolean isAmountValid(double amount){
	//try{ amount}catch(ArithmeticException e){System.out.println(e);}  	
		if(amount>= 0){
			return true;
		}
	
			return false;
	}
	private double transferFromCheqsToSavings(double amount){
	    	return amount;
	}
}*/
//balance public //
//tax called from withdraw
//will change later deposit

  
