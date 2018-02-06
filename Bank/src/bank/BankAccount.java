/*File Name: BankAccount.java
Developers: <<Serge Jabo Byusa>>
Purpose: << This is act as parent of checkings and savings account and does all there transactions>>
Inputs: <<None>> 
Outputs: <<>> 
Modifications
==========
<<S.B.J>> <<2nd feb>> <<created and made a made it better() method better>>*/
package bank;

public  class BankAccount { //CheckingsAccount is the child of Customer(a customer owns a checkingsAccount)//implements Transactions
  private double balance;
  private int accountNumber;
  //static cause it is shared by all customers
  private static int lastAccountNumber = 260600000;
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<Constructor with input>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
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
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<Constructor without  input helps for declaration>>
// Inputs: <<None>> 
// Outputs: <<NOne>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public BankAccount(){
        this.balance=0;
        this.accountNumber = lastAccountNumber + 1;
        this.lastAccountNumber = accountNumber;
    }
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<To deposit money in a give bank account>>
// Inputs: <<depositAmount>> 
// Outputs: <<true or false if you can deposit or if yes it changes the balance>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public boolean deposit(double depositAmount){
        if(depositAmount<0){
            System.out.println("Invalid Input, there is no negative money talk to our loan system!!!");
            return false;
        }else{
          balance += depositAmount;
          return true;
        }
    }
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<To deposit money in a give bank account>>
// Inputs: <<WithdrawAmount>> 
// Outputs: <<true or false if you can withdraw or if yes it changes the balance>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
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
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<To deposit money in a give bank account>>
// Inputs: <<amount>> 
// Outputs: <<Checks if the amount is valid or not>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    private boolean isAmountValid(double amount){
		if(amount>= 0){
			return true;
		} 
			return false;
	}
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<to get the accountNumber>>
// Inputs: <<None>> 
// Outputs: <<returns the accountNumber>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public int getaccountNumber(){
        return accountNumber;
    }
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<to get the balance>>
// Inputs: <<None>> 
// Outputs: <<returns the balance>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public double getBalance(){
        return balance;
    }
 // Developers: <<Serge Jabo Byusa>>
// Purpose: <<to get transfer Money from one account to the otherone>>
// Inputs: <<the amount To Transfer, the secondAccount>> 
// Outputs: <<returns true if you can trasfer and changes the balance>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
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
	
  //public abstract String getType();
}
