package com.company;

/**
 * Class used to represent a bank database.
 */
public class BankDatabase {

  /**
   * Private attributes.
   */
  private Account[] accounts;   //Array of accounts

  /**
   * No-argument BankDatabase constructor initializes accounts.
   */
  public BankDatabase() {
    accounts = new Account[2]; //Just 2 accounts for testing
    accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
    accounts[1] = new Account(98765, 56789, 200.0, 200.0);
  }

  /**
   * Retrieve Account object from containing specified account number
   *
   * @param accountNumber — integer variable
   * @return accountNumber
   */
  private Account getAccount(int accountNumber) {
    //Loop through accounts searching for matching account number
    for (Account currentAccount : accounts) {
      //Return current account if match found
      if (currentAccount.getAccountNumber() == accountNumber) {
        return currentAccount;
      }
    }
    return null;  //If no matching account was found, return null
  }

  /**
   * Determine whether user-specified account number and PIN match those of an account in the
   * database.
   *
   * @param userAccountNumber — integer value
   * @param userPIN — integer value
   * @return
   */
  public boolean authenticateUser(int userAccountNumber, int userPIN) {
    //Attempt to retrieve the account with the account number
    Account userAccount = getAccount(userAccountNumber);

    //If account exists, return result of Account method validatePIN
    if (userAccount != null) {
      return userAccount.validatePIN(userPIN);
    } else {
      return false; //Account number not found, so return false
    }
  }

  /**
   * Return available balance of Account with specified account number.
   *
   * @param userAccountNumber — integer value
   * @return getAvailableBalance()
   */
  public double getAvailableBalance(int userAccountNumber) {
    return getAccount(userAccountNumber).getAvailableBalance();
  }

  /**
   * Return total balance of Account with specified account number.
   *
   * @param userAccountNumber — integer value
   * @return getTotalBalance()
   */
  public double getTotalBalance(int userAccountNumber) {
    return getAccount(userAccountNumber).getTotalBalance();
  }

  /**
   * Credit an amount to Account with specified account number.
   *
   * @param userAccountNumber — integer value
   * @param amount — integer value
   */
  public void credit(int userAccountNumber, double amount) {
    getAccount(userAccountNumber).credit(amount);
  }

  /**
   * Debit an amount from Account with specified account number.
   *
   * @param userAccountNumber — integer value
   * @param amount — integer value
   */
  public void debit(int userAccountNumber, double amount) {
    getAccount(userAccountNumber).debit(amount);
  }























}
