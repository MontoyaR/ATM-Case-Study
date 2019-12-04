package com.company;

public class ATM {

  private boolean userAuthenticated;  //Whether user is authenticated
  private int currentAccountNumber; //Current user's account number
  private Screen screen;  //ATM's screen
  private Keypad keypad;  //ATM's keypad
  private CashDispenser cashDispenser; //ATM's cash dispenser
  private DepositSlot depositSlot;  //ATM's deposit slot
  private BankDatabase bankDatabase;  //Account information database


  //Constant corresponding to main menu options
  private final int BALANCE_INQUIRY = 1;
  private final int WITHDRAWAL = 2;
  private final int DEPOSIT = 3;
  private final int EXIT = 4;

  //No-argument ATM constructor initializes instance variables
  public ATM() {
    userAuthenticated = false;  //User is not authenticated to start
    currentAccountNumber = 0; //No current account number to start
    screen = new Screen();  //Create Screen
    keypad = new Keypad();  //Create Keypad
    cashDispenser = new CashDispenser();  //Create CashDispenser
    depositSlot = new DepositSlot();  //Create DepositSlot
    bankDatabase = new BankDatabase();  //Create BankDatabase
  }

  //Start ATM
  public void run() {
    //Welcome and authenticate user; perform transactions
    while (true) {
      //Loop while user is not yet authenticated
      while (!userAuthenticated) {
        screen.displayMessageLine("\nWelcome");
        authenticateUser(); //Authenticate user
      }
      performTransactions();  //User is not authenticated
      userAuthenticated = false; //Reset before next ATM session
      currentAccountNumber = 0; //Reset before next ATM session
      screen.displayMessageLine("\nThank you! Goodbye!");
    }
  }

  //Attempts to authenticate user against database
  private void authenticateUser() {
    screen.displayMessage("\nPlease enter your account number: ");
    int accountNumber = keypad.getInput();  //Input account number
    screen.displayMessage("\nEnter your PIN: "); //Prompts for PIN
    int pin = keypad.getInput();  //Input PIN

    //Set userAuthenticated to boolean value returned by database
    userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

    //Check whether authentication succeeded
    if (userAuthenticated) {
      currentAccountNumber = accountNumber; //Save user's account numbber
    } else {
      screen.displayMessageLine("Invalid account number or PIN. Please try again.");
    }
  }

  //Display the main menu and perform transactions
  private void performTransactions() {
    //Local variable to store transaction currently being processed
    Transaction currentTransaction = null;

    boolean userExited = false; //User has not chosen to exit

    //Loop while user has not chosen to exit
    while (!userExited) {
      //Show main menu and get user selection
      int mainMenuSelection = displayMainMenu();

      //Decide how to proceed based on user's menu selection
      switch (mainMenuSelection) {
        //User chose to perform one of three transaction types
        case BALANCE_INQUIRY:
        case WITHDRAWAL:
        case DEPOSIT:

          //Initialize as new object of chosen type
          currentTransaction = createTransaction(mainMenuSelection);
          currentTransaction.execute(); //Execute transaction
          break;
        case EXIT:  //User chose to terminate session
          screen.displayMessageLine("\nExiting the system...");
          userExited = true;  //This ATM session should end
          break;
        default: //User did not enter an integer from 1—4
          screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
          break;
      }
    }
  }

  //Display the main menu and return an input selection
  private int displayMainMenu() {
    screen.displayMessageLine("\nMain menu: ");
    screen.displayMessageLine("1 — View my balance");
    screen.displayMessageLine("2 — Withdraw cash");
    screen.displayMessageLine("3 — Deposit funds");
    screen.displayMessageLine("4 — Exit\n");
    return keypad.getInput(); //Return user's selection
  }

  //Return object of specified Transaction subclass
  private Transaction createTransaction(int type) {
    Transaction temp = null;  //Temporary Transaction variable

    //Determine which type of Transaction to create
    switch (type) {

      case BALANCE_INQUIRY: //Create new BalanceInquiry transaction
        temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
        break;

      case WITHDRAWAL:  //Create new Withdrawal transaction
        temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
        break;

      case DEPOSIT: //Create new Deposit transaction
        temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
        break;
    }
    return temp; //Return the newly created object
  }
}
