package com.company;

import java.util.Scanner;

/**
 * Class used to represent a keypad.
 */
public class Keypad {
  private Scanner input; //Reads data from the command line

  /**
   * No-argument constructor initializes the Scanner
   */
  public Keypad() {
    input = new Scanner(System.in);
  }

  /**
   * Return an integer value entered by user
   * @return input;
   */
  public int getInput() {
    return input.nextInt(); //Assume that user enters an integer
  }
}
