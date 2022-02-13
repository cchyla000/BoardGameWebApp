package com.example.monopoly;

import com.example.monopoly.model.properties.Property;

import java.util.Collections;
import java.util.Set;

public class PlayerImpl {

  private final long id;
  private final int cash;
  private final Set<Property> propertiesOwned;

  public PlayerImpl(final long id) {
    this.id = id;
    this.cash = 0;
    this.propertiesOwned = Collections.emptySet();
  }

  public PlayerImpl(final long id,
                    final int cash,
                    final Set<Property> propertiesOwned) {
    this.id = id;
    this.cash = cash;
    this.propertiesOwned = propertiesOwned;
  }

}
