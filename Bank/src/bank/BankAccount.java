
package bank;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Bank// class Bank
{
      public  static void main(String[] args){
          
          Customer custm1 = new Customer();
          float Newdiscount=2;
          Scanner sc=new Scanner(System.in);
          String name="";
              //Scanner in = new Scanner(System.in);
          while(name!="E" || name!="e"){
            System.out.println("Welcome to RBC, Enter your name to register as a customer");  
            name=sc.next();
            Customer custm = new Customer(name,custm1.ID(),custm1.CustomerDiscount());
            System.out.println("here is your account info: "+custm.toString());
            System.out.println("Click 1 to create Checkings account: ");
            System.out.println("Click 2 to create Deposit account");
             double amount=0,withDraw, Deposit;
          int option=1; //option 2 by default  
    	switch(option){
            case 1:
                System.out.println("create a chekings account by depositing money");
                amount=sc.nextDouble();
                BankAccount account = new BankAccount(amount);
                int choose =1;
                while(choose==1){
                    System.out.println("Welcome "+ name+ " here is your account number"+ account.getNumber());
                    System.out.println("You current balance is" + account.getBalance());
                    System.out.println("How much do you want to withdraw?");
                    withDraw=sc.nextDouble();
                    account.withdraw(withDraw);
                    System.out.println("You current balance is" + account.getBalance());
                    System.out.println("How much do you want to Deposit?");
                    Deposit=sc.nextDouble();
                    account.deposit(Deposit);
                    System.out.println("You current balance is" + account.getBalance());
                }
                System.out.println("You current balance is" + account.getBalance());
                break;
           // case 9: customer1.quit(); break;
            default:
                System.out.println("Invalid Input");
          }
      }
    }
}
    
 /*private String name = "";
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
	
}*/


