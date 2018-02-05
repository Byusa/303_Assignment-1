/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(double balance, int accountNum) {
		super(balance,accountNum);
	}
	
	
	
	public boolean deposit(double amountToDeposit, float discountPercent) {
		if(discountPercent<0 || discountPercent>100) 		//verify that a valid discountPercent has been entered. If not return false.
			return false;
		
		double depositBonus = 1 + (discountPercent/100);		//calculate deposit bonus by adding to 1 dollar bonus the amount the customer earns via discount percentage
		amountToDeposit += depositBonus;						
		return super.deposit(amountToDeposit+depositBonus);		//call the deposit method from superclass
	}
	
	
	
	public boolean withdraw(double amountToWithdraw, float discountPercent) {
		if(amountToWithdraw<1000)				//amount has to be greater than 1000, otherwise user cannot withdraw and return false
			return false;
		
		return super.withdraw(amountToWithdraw);
	}
	
	
	
	public boolean transfer(double amountToTransfer, BankAccount secondAccount) {
		return super.transfer(amountToTransfer, secondAccount);
	}
	
	
	
	public String getType() {
		return "savings";
	}
	

}
