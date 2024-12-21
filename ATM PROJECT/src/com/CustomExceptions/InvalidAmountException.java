package com.CustomExceptions;

public class InvalidAmountException extends Exception{
	  
		public InvalidAmountException(String errormsg) {
		    super(errormsg);
		  }

	}