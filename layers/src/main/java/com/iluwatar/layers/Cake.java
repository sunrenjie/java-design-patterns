package com.iluwatar.layers;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * Cake entity
 *
 */
@Entity
public class Cake {

  @Id
  @GeneratedValue
  private Long id;

  @OneToOne(cascade = CascadeType.REMOVE)
  private CakeTopping topping;

  @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
  private Set<CakeLayer> layers;

  @OneToOne(cascade = CascadeType.REMOVE)
  private CakeBottom bottom;

  public Cake() {
    setLayers(new HashSet<>());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CakeTopping getTopping() {
    return topping;
  }

  public void setTopping(CakeTopping topping) {
    this.topping = topping;
  }

  public Set<CakeLayer> getLayers() {
    return layers;
  }

  public void setLayers(Set<CakeLayer> layers) {
    this.layers = layers;
  }

  public void addLayer(CakeLayer layer) {
    this.layers.add(layer);
  }

  public CakeBottom getBottom() {
    return bottom;
  }

  public void setBottom(CakeBottom bottom) {
    this.bottom = bottom;
  }

  @Override
  public String toString() {
    return String.format("id=%s topping=%s layers=%s bottom=%s", id, topping, layers.toString(), bottom);
  }
}
