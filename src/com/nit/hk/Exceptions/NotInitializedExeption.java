//NotInitializedExeption.java

package com.nit.hk.Exceptions;

public class NotInitializedExeption extends Exception {

	/**
	 * We created this exception to stop the initialization 
	 */
	private static final long serialVersionUID = 1L;

	public NotInitializedExeption() {
		super();
	}
	public NotInitializedExeption(String msg) {
		super(msg);
	}
}
