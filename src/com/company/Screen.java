package com.company;

/**
 * Class used to represent a screen.
 */
public class Screen {

  /**
   * Display a message without a carriage return.
   * @param message — String variable
   */
  public void displayMessage(String message) {
    System.out.println(message);
  }

  /**
   * Display a message with a carriage return.
   * @param message — String variable
   */
  public void displayMessageLine(String message) {
    System.out.println(message);
  }

  /**
   * Display a dollar amount.
   * @param amount — double variable
   */
  public void displayDollarAmount(double amount) {
    System.out.printf("$%,.2f", amount);
  }
}
