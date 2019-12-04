package com.company;

/**
 * Class used to represent a balance inquiry.
 */
public class BalanceInquiry extends Transaction {

  /**
   * Balance inquiry constructor.
   *
   * @param userAccountNumber — integer value
   * @param atmScreen         — Screen object
   * @param atmBankDatabase   — BankDatabase object
   */
  public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
    super(userAccountNumber, atmScreen, atmBankDatabase);
  }

  /**
   * Performs the transaction.
   */
  @Override
  public void execute() {
    //Get reference to bank database and screen
    BankDatabase bankDatabase = getBankDatabase();
    Screen screen = getScreen();

    //Get the available balance for the account involved
    double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

    //Get the total balance for the account involved
    double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

    //Display the balance information on the screen
    screen.displayMessageLine("\nBalance Information:");
    screen.displayMessage(" — Available balance: ");
    screen.displayDollarAmount(availableBalance);
    screen.displayMessage("\n — Total balance: ");
    screen.displayMessageLine("");
  }
}
