package com.company;

/**
 * Abstract class used to represent a transaction.
 */
public abstract class Transaction {

  /**
   * Private attributes.
   */
  private int accountNumber;  //Indicates account involved
  private Screen screen;  //ATM's screen
  private BankDatabase bankDatabase;  //Account info database

  /**
   * Transaction constructor invoked by subclasses using super()
   *
   * @param userAccountNumber — integer value
   * @param atmScreen         — Screen object
   * @param atmBankDatabase   — BankDatabase object
   */
  public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
    accountNumber = userAccountNumber;
    screen = atmScreen;
    bankDatabase = atmBankDatabase;
  }

  /**
   * Return account number.
   *
   * @return accountNumber
   */
  public int getAccountNumber() {
    return accountNumber;
  }

  /**
   * Return reference to screen.
   *
   * @return screen
   */
  public Screen getScreen() {
    return screen;
  }

  /**
   * Return reference to bank database.
   *
   * @return bankDatabase
   */
  public BankDatabase getBankDatabase() {
    return bankDatabase;
  }

  /**
   * Perform the transaction (overridden by each subclass).
   */
  abstract public void execute();
}
