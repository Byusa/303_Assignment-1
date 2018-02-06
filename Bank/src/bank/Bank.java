/*File Name: Bank.java
Developers: <<Serge Jabo Byusa>>
Purpose: << This is where the UI is>>
Inputs: <<None>> 
Outputs: <<None>> 
Modifications
==========
<<S.B.J>> <<2nd feb>> <<created and made a made it better() method better>>*/
package bank;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Bank// class Bank
{
    public  static void main(String[] args){
 // Developers: <<Serge Jabo Byusa>>
// Purpose: <<Do all the transction and the user interface>>
// Inputs: <<None>> 
// Outputs: <<Computes all transactions the user needs to do>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
          
          Customer custm1 = new Customer();
          BankAccount account1 = new BankAccount(); 
          float Newdiscount=2;
          Scanner sc=new Scanner(System.in);
          String name="";
          int exit=9; //9 do not mean anything I just want to keep the variable exit
              //Scanner in = new Scanner(System.in);
              StartOver: while(exit!=0){
            System.out.println("Welcome to RBC, Enter your name to register as a customer");  
            name=sc.nextLine();
            Customer custm = new Customer(name,custm1.ID(),custm1.CustomerDiscount());
            System.out.println("here is your account info: "+custm.toString());
            System.out.println("You can only Deposit, withdraw and Transfer Money once you've created an account:");
            System.out.println("Click 1 to create Checkings account");
            System.out.println("Click 2 to create Savings account");
            System.out.println("Click 6 to exit so that other users can create bank Accounts");
            System.out.println("Click 0 to exit");
            int accoutOPtion=0;
            String comeBack=" s";
        double amount=0,withDrawAmount=0, DepositAmount=0, transferAmount=0; 
        accoutOPtion=inputInt(sc);
    	switch(accoutOPtion){
            
            //exit if the user zero
            case 0: quit (accoutOPtion);
                break;
            //Handle Checkings transactions
            case 1:
                createACheckingTransactions(name, custm1, account1, sc, exit, accoutOPtion);
                break;
            case 2: 
                createASavingsTransactions(name, custm1, account1, sc, exit, accoutOPtion);      
                break;
            case 6: continue; 
            default:
                System.out.println("Invalid Input");
        }
    }
  }
    
    // Developers: <<Serge Jabo Byusa>>
// Purpose: <<to Exit the program at anytime>>
// Inputs: <<an int for the user input>> 
// Outputs: <<quits>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
    public static void quit(int userInput){
          if(userInput == 0){
              System.out.println("Bye, thank you for working with RBC");
              System.exit(0);
          }
    }

// Developers: <<Serge Jabo Byusa>>
// Purpose: <<For Integer input validation>>
// Inputs: <<a scanner int>> 
// Outputs: <<the integer from scanner without an crushing the program>> 
// Side-effects: <<None>>
// Special Notes: <<None>>

public static int inputInt(Scanner keyboard) {
        try{
            return keyboard.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Input Mismatch! Please enter an Int");
            keyboard.next();
            return inputInt(keyboard);
        }
}
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<For Integer input validation>>
// Inputs: <<a scanner double>> 
// Outputs: <<the Double from scanner without an crushing the program>> 
// Side-effects: <<None>>
// Special Notes: <<None>>

public static double inputDouble(Scanner keyboard) {
        try{
            return keyboard.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Input Mismatch! Please enter a Double");
            keyboard.next();
            return inputInt(keyboard);
        }
}


// Developers: <<Serge Jabo Byusa>>
// Purpose: <<print prompt Messages >>
// Inputs: <<a scanner double>> 
// Outputs: <<the Double from scanner without an crushing the program>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
public static void UIMessages(){
                    System.out.println("Click 1 to Depoosit: ");
                    System.out.println("Click 2 to withdraw");
                    System.out.println("Click 3 to Transfer");
                    System.out.println("Click 4 to get the balance");
                    System.out.println("Click 5 to move the creation of another account");
                    System.out.println("Click 6 to exit so that other users can create bank Accounts");
                    System.out.println("Click 0 to terminate the program");
}

// Developers: <<Serge Jabo Byusa>>
// Purpose: <<here where the user creates and do the Savings Transactions>>
// Inputs: << the name, custm1, BankAccount , Scanner ,  exit,  accoutOPtion>> 
// Outputs: <<a transaction>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
public static void createASavingsTransactions(String name, Customer custm1, BankAccount account1, Scanner sc, int exit, int accoutOPtion){
    
            double amount=0,withDrawAmount=0, DepositAmount=0, transferAmount=0; 
        
         System.out.println("You've create a Savings account, Deposit money then go on with other ather transations: ");
                amount=inputDouble(sc);
                
                int accountNumber= account1.getaccountNumber();
                //BankAccount account = new BankAccount(amount,accountNumber);
                SavingsAccount savingsAccount = new SavingsAccount(amount,accountNumber);
                System.out.println("Welcome "+ name+ " here is your account number "+ savingsAccount.getaccountNumber());
                System.out.println("You current balance is " + savingsAccount.getBalance());
                    
                 while(exit!=0){
                    UIMessages(); //print statements
                    int transction = 1;
                    
                    transction=inputInt(sc); 
                    quit (transction);
                    if(transction==1){
                        System.out.println("How much do you want to Deposit?");
                        
                DepositAmount=inputDouble(sc);
                        
                        savingsAccount.deposit(DepositAmount,custm1.CustomerDiscount()); //CustomerDiscount
                        System.out.println("You current balance is " + savingsAccount.getBalance());
                    }else if(transction ==2){
                        System.out.println("How much do you want to withdraw?");
                        
                withDrawAmount=inputDouble(sc);
                        
                        savingsAccount.withdraw(withDrawAmount);
                        System.out.println("You current balance is " + savingsAccount.getBalance());
                    }else if(transction==3){
                        System.out.println("How much do you want to transfer from Checkings account to Savings account ");
                        
                transferAmount=inputDouble(sc);
                                                System.out.println("You current balance is " + savingsAccount.getBalance());

                    }
                    else if(transction==4){
                        System.out.println("You current balance in savings is " + savingsAccount.getBalance());
                    }
                    else if(transction==5){
                            createACheckingTransactions(name, custm1, account1, sc, exit, accoutOPtion);
                    }
                    else if(transction==0){
                        System.out.println("Bye, thank you for working with RBC");
                        System.exit(0);
                    }else{
                        System.out.println("INVALID INPUT");
                    }
                 }
                System.out.println("You current balance on your Checkigs account is " + savingsAccount.getBalance());
    
}
// Developers: <<Serge Jabo Byusa>>
// Purpose: <<here where the user creates and do the checkings Transactions>>
// Inputs: << the name, custm1, BankAccount , Scanner ,  exit,  accoutOPtion>> 
// Outputs: <<a transaction>> 
// Side-effects: <<None>>
// Special Notes: <<None>>
public static void createACheckingTransactions(String name, Customer custm1, BankAccount account1, Scanner sc, int exit, int accoutOPtion){
        double amount=0,withDrawAmount=0, DepositAmount=0, transferAmount=0; 
    
    System.out.println("You've create a Checkings account, Deposit money then go on with other ather transations: ");
                amount=inputDouble(sc);
               
                int accountNumber= account1.getaccountNumber();
                //BankAccount account = new BankAccount(amount,accountNumber);
                CheckingAccount checkingAccount = new CheckingAccount(amount,accountNumber);
                System.out.println("Welcome "+ name+ " here is your account number "+ checkingAccount.getaccountNumber());
                System.out.println("You current balance is " + checkingAccount.getBalance());
                    
                while(exit!=0){
                   UIMessages(); //print statements
                     int transction = 0;
                      transction=inputInt(sc); 
                    quit (transction);
                    if(transction==1){
                        System.out.println("How much do you want to Deposit?");
                DepositAmount=inputDouble(sc);
                   
                        checkingAccount.deposit(DepositAmount);
                        System.out.println("You current balance is " + checkingAccount.getBalance());
                    }else if(transction ==2){
                        System.out.println("How much do you want to withdraw?");
                withDrawAmount=inputDouble(sc);
                        
                        checkingAccount.withdraw(withDrawAmount, custm1.CustomerDiscount());
                        System.out.println("You current balance is " + checkingAccount.getBalance());
                    }else if(transction==3){
                        System.out.println("How much do you want to transfer from Checkings account to Savings account ");
                transferAmount=inputDouble(sc);
                                        System.out.println("You current balance is " + checkingAccount.getBalance());
                    }else if(transction==4){
                        System.out.println("You current balance in Checkings is " + checkingAccount.getBalance());
                    }else if(transction==5){
                createASavingsTransactions(name, custm1, account1, sc, exit, accoutOPtion);      
                    }
                    else if(transction==0){
                        System.out.println("Bye, thank you for working with RBC");
                        System.exit(0);
                    }else{
                        System.out.println("INVALID INPUT");   
                    }
                 }
                System.out.println("You current balance on your Checkigs account is " + checkingAccount.getBalance());
}
}
