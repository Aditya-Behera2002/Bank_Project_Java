package com.nit.hk.blogic;

import com.nit.hk.Exceptions.InsufficientFundsException;
import com.nit.hk.Exceptions.NegativeAmountException;
import com.nit.hk.Exceptions.NotInitializedExeption;
import com.nit.hk.spec.BankAccount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SBIBankAccount implements BankAccount{
	
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	/**
	 * the fields above are the information that we are going to pass via external
	 * file i,e hdfcdetails.txt.
	 * it should be put in project folder to be read by the program. 
	 */
	private long accNum;
	private String accHNname;
	private double balance;
	/**
	 * these fields above are going to be given by user via keyboard. 
	 */
	
	static {   //static block 
		
		try {BufferedReader br = 
				    new BufferedReader(new FileReader("sbidetails.txt"));
		
		bankName=br.readLine();
		branchName=br.readLine();
		ifsc=br.readLine();
		
		}catch(FileNotFoundException e) {
			System.out.println("sbidetails.txt file is not found");
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	public SBIBankAccount(long accNum, String accHName, double balance) {
		this.accNum=accNum;
		this.accHNname=accHNname;
		this.balance=balance;
	}
	@SuppressWarnings("unused")
	private void verifySFI() throws NotInitializedExeption {
		if (bankName==null)
			      throw new NotInitializedExeption("sbidetails.txt file is not found");
			
		}
	

	@Override
	public void deposite(double amt) throws NegativeAmountException {
		
		if (amt<=0)
			    throw new NegativeAmountException("Don't pass negative values");
		
		balance=balance+amt;
	}

	@Override
	public void withdraw(double amt) throws NegativeAmountException, InsufficientFundsException {
		if (amt<=0)
		    throw new NegativeAmountException("Don't pass negative values");
		if (amt>balance)
			throw new InsufficientFundsException("Insufficent funds");
		balance=balance-amt;
	}

	@Override
	public void currentBalance() {
		System.out.println(balance);
		
		
	}

}
