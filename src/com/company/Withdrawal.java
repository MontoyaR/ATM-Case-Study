package com.company;

/**
 * Class Withdrawal represents an ATM withdrawal transaction
 */
public class Withdrawal extends Transactions {

  // private attributes
  private int accountNumber;  // account to withdraw funds from
  private double amount;  // amount to withdraw

  // reference to associated objects
  private Screen screen;  // ATM's screen
  private Keypad keypad;  // ATM's keypad
  private CashDispenser cashDispenser;  // ATM's cash dispenser
  private BankDatabase bankDatabase;  // Account info database

  // no argument constructor
  public Withdrawal(){

  }

  // operations
  public void execute(){

  }
}
