/*File Name: CheckingAccount.java
Developers: <<Serge Jabo Byusa>>
Purpose: <<Handles special checkings transctions>>
Inputs: <<None>> 
Outputs: <<>> 
Modifications
==========
<<S.B.J>> <<2nd feb>> <<created and made a made it better() method better>>*/
package bank;
public class CheckingAccount extends BankAccount {
    
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<Constructor with input>>
// Inputs: <<Balance and accnout number>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
	public CheckingAccount(double balance,int accountNum) {
		super(balance,accountNum);
	}
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<withchdrwo with charges the amount to the checkings account>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
	
	public boolean withdraw(double amountToWithdraw, double discountPercent) {
		double ChargedOnWithdraw = 1 - discountPercent;		//1 dollar is the default charge, subtract from 1 the discount user receives		
		amountToWithdraw += ChargedOnWithdraw; 				//add withdrawal charge to the total amount to be withdrawn
		return super.withdraw(amountToWithdraw);					//call the withdraw method from superclass with new withdrawal value				
	}
        // Developers: <<Serge Jabo Byusa>>
// Purpose: <<deposit amount to the checkings account>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
        @Override
	public boolean deposit(double amountToDeposit) {
		return super.deposit(amountToDeposit);
	}
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<transfer amount to the checkings account>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
        @Override
	public boolean transfer(double amountToTransfer, BankAccount secondAccount) {
		return super.transfer(amountToTransfer, secondAccount);
	}
	
}
