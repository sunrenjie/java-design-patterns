package com.iluwatar.abstractfactory;

/**
 * OrcQueen
 */
public class OrcQueen implements Queen {
  static final String DESCRIPTION = "This is the Orc queen!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
