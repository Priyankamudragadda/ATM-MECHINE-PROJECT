package com.Interfaces;

import com.CustomExceptions.InsufficientBalanceException;
import com.CustomExceptions.InsufficientMachineBalanceException;
import com.CustomExceptions.InvalidAmountException;
import com.CustomExceptions.NotAOperatorException;

public interface IATMService {
  
  //to get the user type weather the user is operator or normal user
  public abstract String getUserType() throws NotAOperatorException;
  
  //To withdraw amount 
  //1. will throw invalid amount exception if the amount is not a valid demontation
  //2. will throw insufficient balance exception the customer has
  //3. will throw insufficient machinebalance exception if the machine has insufficient balance
  public abstract double withdrawAmount(double wthAmount)
      throws InvalidAmountException,
      InsufficientBalanceException,
      InsufficientMachineBalanceException, InsufficientBalanceException, InsufficientMachineBalanceException;
  
  //to deposit amount
  public abstract double depositAmount(double dptAmount)throws InvalidAmountException;
  
  //to check balance
  public abstract double checkBalance();
  
  //to change PIN number
  public abstract void changePinNumber(int pinNumber);
  
  //change PIN number
  public abstract int getPinNumber();
  
  //to get userName
  public abstract String getUserName();
  
  // to get a chances of a pin number
  public abstract int getChances();
  
  //to decrease the no.of while enter the wrong pin number
  public abstract void decreaseChances();
  
  //to reset pin number chances by Bank operator
  public abstract void resetPinChances();
  
  //to get the MINIStatement of an Account
  public abstract void getMiniStatement();
  
}