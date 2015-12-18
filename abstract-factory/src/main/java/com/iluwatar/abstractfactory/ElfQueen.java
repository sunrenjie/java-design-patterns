package com.iluwatar.abstractfactory;

/**
 * ElfQueen
 */
public class ElfQueen implements Queen {
  static final String DESCRIPTION = "This is the Elven queen!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
