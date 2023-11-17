//BankAccount.java

package com.nit.hk.spec;
/**
 * This is the interface super class which contains the abstract methods or functionality of the 
 * bank.
 */

import com.nit.hk.Exceptions.NegativeAmountException;
import com.nit.hk.Exceptions.InsufficientFundsException;


public interface BankAccount {

	public void deposite (double amt)
                                 throws NegativeAmountException;

    public void withdraw(double amt)
                                 throws NegativeAmountException,InsufficientFundsException;
    
    public void currentBalance();
}
    