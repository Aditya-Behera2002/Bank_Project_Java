// NegativeAmountException.java

package com.nit.hk.Exceptions;

public class NegativeAmountException extends Exception {
       /**
	 * We created this exception to stop user from entering negative amount. 
	 * That means we are not allowed to enter negative values.
	 * If we enter we be thrown an exception massage.
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmountException() {
    	   super();
       }
    public NegativeAmountException(String msg) {
    	super (msg);
    }
}
