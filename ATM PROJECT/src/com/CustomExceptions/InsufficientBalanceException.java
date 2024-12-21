package com.CustomExceptions;

public class InsufficientBalanceException extends Exception{
  
	 public InsufficientBalanceException(String errormsg) {
		    super(errormsg);
		  }

}