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
        // A customer has a name, a unique customer number, and a discount percentage.
   private long IDGenerator (){
	   long leftLimit = 1L;
    	   long rightLimit = 10L;
           long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
	   return generatedLong;
   }
   private long getID(){
	  long Id = IDGenerator();
           HashSet<Long> store = new HashSet<Long>();
           while(!store.contains(Id)){
               Id = IDGenerator();
           }
           store.add(Id);
	  return Id;
  }
   public String toString() {
        return this.CustomersName + "," + this.CustomersID + "," + this.discount;
    }
     public float CustomerDiscount(){return 0.15f;}  //interest rate
        public void CustomerDiscounts(){        
            System.out.print(0.15);
        }  //interest rate

   /*
   public void Idi (){
       System.out.print(getID);
   }
    public void name (){
        
       System.out.print(name);
   }*/
    public Customer(String NewName, long ID, float Newdiscount ){
          CustomersName = NewName;
          ID = getID();
          CustomersID = ID;
          Newdiscount = CustomerDiscount();
          discount =Newdiscount;
    }
	
}
