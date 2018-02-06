/*File Name: Customer.java
Developers: <<Serge Jabo Byusa>>
Purpose: << This where all customer's information is kept >>
Inputs: <<None>> 
Outputs: <<Customer's Name, Id, discount>> 
Modifications
==========
<<S.B.J>> <<2nd feb>> <<created and made a made it better() method better>>*/

package bank;
import java.util.*;

public class Customer {//extends Bank
	private String CustomersName;
	private int CustomersID;
	private float discount;
        // A customer has a name, a unique customer number, and a discount percentage.
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
    // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Constructor with input>>
// Inputs: <<None>> 
// Outputs: <<Id, discout,, name>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public Customer(String NewName, int ID, float Newdiscount ){
          CustomersName = NewName;
          //ID = ID();
          CustomersID = ID;
          //Newdiscount = CustomerDiscount();
          discount =Newdiscount;
    }
    
    // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Generates random numers bewtwen the interval given>>
// Inputs: <<None>> 
// Outputs: <<NONE>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public static int IDGenerator (){
           int generated=(new Random().nextInt((9999999-1000000) + 1)  + 1000000);
	   return generated;
    }
    
 // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Generates random IDss>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public static int ID(){
	  int Id = IDGenerator();
           HashSet<Integer> store = new HashSet<Integer>();
            while(store.contains(Id)){
               Id = IDGenerator();
            }
            store.add(Id);
	  return Id;
    }   
 // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Generates random Discount values>>
// Inputs: <<None>> 
// Outputs: <<Balance and accnout number>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public static float CustomerDiscount(){
        Random rand = new Random();
        float fl=rand.nextFloat();
        return fl;
    }  //interest rate

        @Override
    public String toString() {
        return ("Customer's name: "+this.CustomersName + "," + " Customer's ID: "+ this.CustomersID + "," + " Discount Percentage: "+this.discount);
    }
    public Customer(){
          this.CustomersName = CustomersName;
          this.CustomersID = CustomersID;
          this.discount =discount;
    }
	
}
