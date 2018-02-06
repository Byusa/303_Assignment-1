/*File Name: SavingsAccount.java
Developers: <<Serge Jabo Byusa>>
Purpose: <<Handles special savings transctions>>
Inputs: <<None>> 
Outputs: <<>> 
Modifications
==========
<<S.B.J>> <<2nd feb>> <<created and made a made it better() method better>>*/
package bank;

public class SavingsAccount extends BankAccount{
	
 // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Constructor with input>>
// Inputs: <<Balance and accnout number>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
	public SavingsAccount(double balance, int accountNum) {
		super(balance,accountNum);
	}
	
/// Developers: <<Serge Jabo Byusa>>
// Purpose: <<deposit amount to the checkings accoun with bonus >>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
	
	public boolean deposit(double amountToDeposit, float discountPercent) {
		if(discountPercent<0 || discountPercent>1) 		//verify that a valid discountPercent has been entered. If not return false.
			return false;
		
		double BonusONdeposit = 1 + (discountPercent);		//calculate deposit bonus by adding to 1 dollar bonus the amount the customer earns via discount percentage
		amountToDeposit += BonusONdeposit;						
		return super.deposit(amountToDeposit+BonusONdeposit);		//call the deposit method from superclass
	}
	
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<withchdrwo with charges the amount to the checkings account>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>	
	
	public boolean withdraw(double amountToWithdraw, float discountPercent) {
		if(amountToWithdraw<1000)				//amount has to be greater than 1000, otherwise user cannot withdraw and return false
			return false;
		
		return super.withdraw(amountToWithdraw);
	}
	
	
	// Developers: <<Serge Jabo Byusa>>
// Purpose: <<transfer amount to the checkings account>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
	public boolean transfer(double amountToTransfer, BankAccount secondAccount) {
		return super.transfer(amountToTransfer, secondAccount);
	}
}
