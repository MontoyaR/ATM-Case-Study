package com.company;

/**
 * Class used to represent a cash dispenser.
 */
public class CashDispenser {
  //The default initial number of bills in the cash dispenser
  private final static int INITIAL_COUNT = 500;
  private int count;  //Number of $20 bills remaining

  //No-argument CashDispenser constructor initializes count to default
  public CashDispenser() {
    count = INITIAL_COUNT;  //Set count attribute to default
  }

  //Simulate dispensing of specified amount of cash
  public void dispenseCash(int amount) {
    int billsRequired = amount / 20;  //Number of $20 bills required
    count -= billsRequired;  //Update the count of bills
  }

  //Indicate whether cash dispenser can dispense desired amount
  public boolean isSufficientCashAvailable(int amount) {
    int billsRequired = amount / 20;  //Number of $20 bills required

    if (count >= billsRequired) {
      return true;  //Enough bills available
    } else {
      return false; //Not enough bills available
    }
  }
}
