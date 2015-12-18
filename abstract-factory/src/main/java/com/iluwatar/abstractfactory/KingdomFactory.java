package com.iluwatar.abstractfactory;

/**
 * 
 * KingdomFactory factory interface.
 * 
 */
public interface KingdomFactory {

  Castle createCastle();

  King createKing();

  Queen createQueen();

  Army createArmy();

}
