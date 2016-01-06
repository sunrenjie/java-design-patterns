package com.iluwatar.layers;

import java.util.List;
import java.util.Optional;

/**
 * 
 * DTO for cakes
 *
 */
public class CakeInfo {

  public final Optional<Long> id;
  public final CakeToppingInfo cakeToppingInfo;
  public final List<CakeLayerInfo> cakeLayerInfos;
  public final CakeBottomInfo cakeBottomInfo;

  /**
   * Constructor
   */
  public CakeInfo(Long id, CakeToppingInfo cakeToppingInfo, List<CakeLayerInfo> cakeLayerInfos,
                  CakeBottomInfo cakeBottomInfo) {
    this.id = Optional.of(id);
    this.cakeToppingInfo = cakeToppingInfo;
    this.cakeLayerInfos = cakeLayerInfos;
    this.cakeBottomInfo = cakeBottomInfo;
  }

  /**
   * Constructor
   */
  public CakeInfo(CakeToppingInfo cakeToppingInfo, List<CakeLayerInfo> cakeLayerInfos,
                  CakeBottomInfo cakeBottomInfo) {
    this.id = Optional.empty();
    this.cakeToppingInfo = cakeToppingInfo;
    this.cakeLayerInfos = cakeLayerInfos;
    this.cakeBottomInfo = cakeBottomInfo;
  }

  /**
   * Calculate calories
   */
  public int calculateTotalCalories() {
    int total = cakeToppingInfo != null ? cakeToppingInfo.calories : 0;
    total += cakeLayerInfos.stream().mapToInt(c -> c.calories).sum();
    total += cakeBottomInfo != null ? cakeBottomInfo.calories : 0;
    return total;
  }

  @Override
  public String toString() {
    return String.format("CakeInfo id=%d topping=%s layers=%s bottom=%s totalCalories=%d",
        id.orElse(-1L), cakeToppingInfo, cakeLayerInfos, cakeBottomInfo,
        calculateTotalCalories());
  }
}
