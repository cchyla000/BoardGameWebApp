package com.example.monopoly.model.properties;

public enum Utility {

  ELECTRIC_COMPANY,
  WATER_WORKS;

  // If one utility is owned, rent is 4 times amount shown on dice.
  // if both utilities are owned rent is 10 times amount shown on dice

  private static final int MORTGAGE_VALUE = 75;

}
