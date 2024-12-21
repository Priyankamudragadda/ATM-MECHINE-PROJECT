package com.CustomExceptions;

public class IncorrectPinLimitReachedException extends Exception{
  
  public IncorrectPinLimitReachedException(String errormsg) {
    super(errormsg);
  }

}
