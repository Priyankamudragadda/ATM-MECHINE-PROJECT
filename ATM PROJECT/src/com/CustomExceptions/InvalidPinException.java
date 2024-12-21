package com.CustomExceptions;

public class InvalidPinException extends Exception{
	  
		public InvalidPinException(String errormsg) {
		    super(errormsg);
		  }

	}