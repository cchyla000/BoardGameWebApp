package com.example.monopoly.model.state;

import com.example.monopoly.Player;
import com.example.monopoly.model.context.ActionContext;
import com.example.monopoly.model.properties.Property;
import com.example.monopoly.model.properties.classicAmericanProperties.Property;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MonopolyStateImpl implements MonopolyState {

  private final Set<Property> properties;

  private int turn;
  private long currentPlayerIndex;
  private List<Player> players;
  private ActionContext actionContext;


  public MonopolyStateImpl() {
    this.properties = Collections.emptySet();
  }


}
