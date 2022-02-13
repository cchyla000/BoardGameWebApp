package com.example.monopoly.model.properties;

import com.example.monopoly.model.properties.classicAmericanProperties.Property;

public class PropertyImpl implements Property {

  private TitleDeed titleDeed;
  private final int numHouses;
  private final int numHotels;

  public PropertyImpl() {
    this.numHouses = 0;
    this.numHotels = 0;
  }

  public PropertyImpl(final int numHouses,
                      final int numHotels) {
    this.numHouses = numHouses;
    this.numHotels = numHotels;
  }

  public int getNumHouses() {
    return this.numHouses;
  }

  public int getNumHotels() {
    return this.numHotels;
  }

}
