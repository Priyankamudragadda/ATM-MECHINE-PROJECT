package com.CustomExceptions;

public class InsufficientMachineBalanceException extends Exception{
  
	public InsufficientMachineBalanceException(String errormsg) {
	    super(errormsg);
	  }

}