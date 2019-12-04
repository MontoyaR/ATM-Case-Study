package com.company;

/**
 * Class used to represent an account.
 */
public class Account {

  /**
   * Private attributes.
   */
  private int accountNumber;  //Account number
  private int pin;  //PIN for authentication
  private double availableBalance;  //Funds available for withdrawal
  private double totalBalance;  //Funds available + pending deposits

  /**
   * Account constructor initializes attributes.
   *
   * @param theAccountNumber    — account number of Account
   * @param thePIN              — PIN of Account
   * @param theAvailableBalance — available balance of Account
   * @param theTotalBalance     — total balance of Account
   */
  public Account(int theAccountNumber, int thePIN, double theAvailableBalance,
      double theTotalBalance) {
    accountNumber = theAccountNumber;
    pin = thePIN;
    availableBalance = theAvailableBalance;
    totalBalance = theTotalBalance;
  }

  /**
   * Determines whether a user-specified PIN matches PIN in Account.
   *
   * @param userPIN — integer variable
   * @return boolean value
   */
  public boolean validatePIN(int userPIN) {
    if (userPIN == pin) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Getter method for available balance.
   *
   * @return availableBalance
   */
  public double getAvailableBalance() {
    return availableBalance;
  }

  /**
   * Getter method for total balance.
   *
   * @return totalBalance
   */
  public double getTotalBalance() {
    return totalBalance;
  }

  /**
   * Credits an amount to the account.
   *
   * @param amount — double variable
   */
  public void credit(double amount) {
    totalBalance += amount;   //Add to total balance
  }

  /**
   * Debits an amount from the account
   *
   * @param amount — double variable
   */
  public void debit(double amount) {
    availableBalance -= amount;   //Subtract from available balance
    totalBalance -= amount;
  }

  /**
   * Getter method for the account number.
   *
   * @return accountNumber
   */
  public int getAccountNumber() {
    return accountNumber;
  }
}
