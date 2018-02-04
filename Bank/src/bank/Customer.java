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

public class Customer {//extends Bank
	private String CustomersName;
	private int CustomersID;
	private float discount;
        // A customer has a name, a unique customer number, and a discount percentage.
     public float CustomerDiscount(){return 0.15f;}  //interest rate
     public void printCustomerDiscounts(){        
            System.out.print(0.15);
        }  //interest rate

   public void  setdiscount(float discount){
       this.discount = discount;
      }
   public float getdiscount (){
       return discount;
      }

   public void  setCustomersID(int CustomersID){
       this.CustomersID = CustomersID;
   }
    public int getCustomersID (){
       return CustomersID;
    }
    
    public void setCustomersName (String CustomersName){
       this.CustomersName = CustomersName;
   }
     public String  getCustomersName(){
       return CustomersName;
      }
    
    public Customer(String NewName, int ID, float Newdiscount ){
          CustomersName = NewName;
          //ID = ID();
          CustomersID = ID;
          //Newdiscount = CustomerDiscount();
          discount =Newdiscount;
    }
    public static int IDGenerator (){
           int generated=(new Random().nextInt((9999999-1000000) + 1)  + 1000000);
	   return generated;
    }
   public static int ID(){
	  int Id = IDGenerator();
           HashSet<Integer> store = new HashSet<Integer>();
           while(store.contains(Id)){
               Id = IDGenerator();
           }
           store.add(Id);
           Id = Id;
	  return Id;
    }   
      public String toString() {
        return this.CustomersName + "," + this.CustomersID + "," + this.discount;
    }
      
      public Customer(){
          this.CustomersName = CustomersName;
          //ID = ID();
          this.CustomersID = CustomersID;
          //Newdiscount = CustomerDiscount();
          this.discount =discount;
    }
	
}
