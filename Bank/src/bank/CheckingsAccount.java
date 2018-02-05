/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author jabo.byusa
 */

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount(double balance,int accountNum) {
		super(balance,accountNum);
	}
	
	public boolean deposit(double amountToDeposit) {
		return super.deposit(amountToDeposit);
	}
	
	public boolean withdraw(double amountToWithdraw, double discountPercent) {
		double withdrawalCharge = 1 - discountPercent;		//1 dollar is the default charge, subtract from 1 the discount user receives		
		amountToWithdraw += withdrawalCharge; 				//add withdrawal charge to the total amount to be withdrawn
		return super.withdraw(amountToWithdraw);					//call the withdraw method from superclass with new withdrawal value				
	}
	
	public boolean transfer(double amountToTransfer, BankAccount secondAccount) {
		return super.transfer(amountToTransfer, secondAccount);
	}
	
	public String getType() {
		return "checkings";
	}
	
}
