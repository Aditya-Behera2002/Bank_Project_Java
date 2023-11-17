//InsufficientFundsException.java

package com.nit.hk.Exceptions;

public class InsufficientFundsException extends Exception{

	/**
	 * We created this exception to stop user from withdrawing more amount then 
	 * available in the account.
	 * If we enter wrong values then we be thrown the exception massage.
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}
