package bank;

interface Transactions{
	float rateOfInterest(); //added
        float chargeRate();
	void deposit (double newAmount);
	double withdraw (double newAmount);
}
class BankAccount { //CheckingsAccount is the child of Customer(a customer owns a checkingsAccount)//implements Transactions
  private double balance;
  private int accountNumber;
  //static cause it is shared by all customers
  private static int lastAccountNumber = 260600000;

    public BankAccount(double intialBalance){
        balance = intialBalance;
        accountNumber = lastAccountNumber + 1;
        lastAccountNumber = accountNumber;
    }
    public void deposit(double depositAmount){
        balance += depositAmount;
    }
    public boolean withdraw(double withdrawAmount){
        if (withdrawAmount > balance){    
            System.out.println("Sorry, Insufficient Funds!!!");
            return false;
        } else {
            balance -= withdrawAmount;
            return true;
        }
    }
    /*private boolean isAmountValid(double amount){
		if(amount>= 0){
			return true;
		} 
			return false;
	}*/
    public int getNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

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

  
