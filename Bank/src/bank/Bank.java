
package bank;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Bank// class Bank
{
    
 private String name = "";
 private Double interestRate= 0.10;
 private Double charge= 0.15;
 
 String getName(String newName){
     return newName=name.clone();
 }
	public static void main (String[] args) throws java.lang.Exception
	{
            int i=0;//default
            double amount=0.0;
           
	    Scanner sc=new Scanner(System.in);  
	    //Arraylist<Customer> customers = new Arraylist<Customer>();
    long ID=0;
    List<Customer> customerList = new ArrayList<Customer>();
    System.out.println("\n Welcome sir/Madam create an with RBC: ");	
    System.out.println("Click 0 to exit");
    System.out.println("Enter your name");  
    Name=sc.next(); 
            while(i!=0){
    		Customer custmer = new Customer(Name, ID);
		customerList.add(custmer);
               // Customer customer1 = new Customer(Name, ID, DiscountPertg);
                CheckingsAccount chq = new CheckingsAccount(amount); //account of customer
                SavingsAccount svgs = new SavingsAccount(amount); //account of customer
		Double Balance = getBalance();
		int option=2; //option 2 by default  
    		switch(option){  
		case 1: customer1.chq.getBalance(); break; //Customer checks his/her checking acccount balance here
		case 2: customer1.svgs.getBalance(); break; //Customer checks his/her savings acccount balance here		
    		case 3: customer1.chq.deposit(amount); break; //Customer  deposits to his/her checking acccount balance here
    		case 4: customer1.chq.withdraw(amount); break; //Customer  withdraws to his/her checking acccount balance here
    		case 5: customer1.svgs.deposit(amount); break; //Customer  deposits to his/her savings acccount balance here
		case 6: customer1.svgs.withdraw(amount); break; //Customer  withdraws to his/her checking acccount balance here
		case 7: customer1.transferCheckToSavgs(amount); break; //Customer trasfers from his/her checckings to savings here
		case 8: customer1.transferFromSavgsToCheck(amount); break; //Customer trasfers from his/her checckings to savings here
		case 9: customer1.quit(); break;
		default:System.out.println("invalid option");  
            }
	}
	
}


