package com.CustomExceptions;

public class InvalidCardException extends Exception{
	  
		public InvalidCardException(String errormsg) {
		    super(errormsg);
		  }

	}