package com.iluwatar.layers;

import java.util.Optional;

/*
 * DTO for cake bottom
 */
public class CakeBottomInfo {
  public final Optional<Long> id;
  public final String name;
  public final int calories;

  /**
   * Constructor
   */
  public CakeBottomInfo(Long id, String name, int calories) {
    this.id = Optional.of(id);
    this.name = name;
    this.calories = calories;
  }

  /**
   * Constructor
   */
  public CakeBottomInfo(String name, int calories) {
    this.id = Optional.empty();
    this.name = name;
    this.calories = calories;
  }

  @Override
  public String toString() {
    return String.format("CakeBottomInfo id=%d name=%s calories=%d", id.orElse(-1L), name, calories);
  }
}