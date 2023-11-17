package com.nit.hk.main;

import java.util.Scanner;

import com.nit.hk.Exceptions.NegativeAmountException;
import com.nit.hk.Exceptions.InsufficientFundsException;
import com.nit.hk.Exceptions.NotInitializedExeption;

import com.nit.hk.spec.BankAccount;

import com.nit.hk.blogic.HDFCBankAccount;
import com.nit.hk.blogic.SBIBankAccount;
import com.nit.hk.blogic.ICICIBankAccount;

@SuppressWarnings("unused")
public class Bank {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		 
		System.out.println("Enter accNum: ");
		long accNum=scn.nextLong(); scn.nextLine();
		
		System.out.println("Enter accHName: ");
		String accHName=scn.nextLine();
		
		System.out.println("Enter balance: ");
		double balance=scn.nextDouble();
		
		BankAccount acc;
		acc= new HDFCBankAccount(accNum, accHName, balance);
		acc= new SBIBankAccount(accNum, accHName , balance);
		acc= new ICICIBankAccount(accNum,accHName, balance);

		loop:while(true) {

			System.out.println("\nChoose one option");
            System.out.println("  1. Deposit");
            System.out.println("  2. Withdraw");
            System.out.println("  3. Current Balance");
            System.out.println("  4. Exit");

            System.out.println("Enter one option");
            
                int option= scn.nextInt();

          switch (option) {

               case 1:
                     try { //deposit money
		             System.out.println("Enter the deposit amount: ");
		    double amt=scn.nextDouble();
		    acc.deposite(amt);
		             System.out.println(amt+ "is credited");
              }catch(NegativeAmountException e) {
		             System.out.println(e.getMessage());
        }
               break;

                case 2:
                 try { //withdraw money
		               System.out.println("Enter the withdraw money: ");
		                  double amt=scn.nextDouble();
		                      acc.withdraw(amt);
		               System.out.println(amt+ "is debited");
                }catch (NegativeAmountException| InsufficientFundsException e) {
		               System.out.println("Error: "+e.getMessage());
        }
                  break;

                  case 3: //current balance
                       System.out.println("Current Balance: ");
		                acc.currentBalance();

		          break;
		
                  case 4: //exit
                       System.out.println("Thank you visit again :-)");
                  break loop;

                  default: //wrong choice
                       System.out.println("Wrong option");

                       }	//switch close
                     }
	              }//main close
	
               }  //class close 




  
 
				
					 
						
			
				
	
		
	


