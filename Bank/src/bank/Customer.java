//package pinmain;
/*File Name: Customer.java
Developers: <<Serge Jabo Byusa>>
Purpose: << ....>>
Inputs: <<None>> 
Outputs: <<None>> 
Modifications
==========
<<S.B.J>> <<29th Jan>> <<created and made a inputValidation() method better>>*/

package bank;
import java.util.*;

public class Customer extends Bank{
	private String CustomersName;
	private long CustomersID;
	private double discount;
        private double amount;
        
   private long IDGenerator (){
	   long leftLimit = 1L;
    	   long rightLimit = 10L;
           long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
	   return generatedLong;
   }
  public long getID(){
	  long Id = IDGenerator();
	  return Id;
  }
    
    public Customer(String NewName, long ID){
          ID = IDGenerator();
          CustomersID = ID;
	  CustomersName = NewName;
    }
	private boolean isAmountValid(String input){
		
		if(amount>= 0){
			return true;
		} 
			return false;
	}
	
}
