package com.company;

public class ATM {

  private boolean userValidated;  //Whether user is authenticated
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
    userValidated = false;  //User is not authenticated to start
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
    while(true) {
      //Loop while user is not yet authenticated
      while(!userValidated) {
        screen.displayMessageLine("\nWelcome");
        authenticateUser(); //Authenticate user
      }
      performTransactions();  //User is not authenticated
      userAuthenrticated = false; //Reset before next ATM session
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
  }








}
