package com.company;

/**
 * Class used to represent a deposit slot.
 */
public class DepositSlot {

  /**
   * Indicate whether envelope was received (always returns true, because this is only a software
   * simulation of a real deposit slot).
   *
   * @return boolean — true
   */
  public boolean isEnvelopeReceived() {
    return true;
  }
}
