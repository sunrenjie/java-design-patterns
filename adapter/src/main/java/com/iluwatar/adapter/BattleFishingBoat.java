package com.iluwatar.adapter;

/**
 *
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link BattleShip}
 * interface expected by the client ({@link Captain}). <br>
 * In this case we added a new function fire to suit the interface. We are reusing the
 * {@link FishingBoat} without changing itself. The Adapter class can just map the functions of the
 * Adaptee or add, delete features of the Adaptee.
 *
 */
public class BattleFishingBoat implements BattleShip {

  private FishingBoat boat;

  public BattleFishingBoat() {
    boat = new FishingBoat();
  }

  public BattleFishingBoat(FishingBoat boat) {
    this.boat = boat;
  }

  @Override
  public void fire() {
    // FishingBoat's fire() considered inadequate for our use; hence creates our own version.
    System.out.println("fire!");
  }

  @Override
  public void move() {
    boat.sail();
  }
}
