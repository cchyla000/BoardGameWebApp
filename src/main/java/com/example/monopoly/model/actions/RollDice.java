package com.example.monopoly.model.actions;

import com.example.monopoly.model.state.MonopolyState;

public class RollDice implements MonopolyAction {

  private final long playerId;

  public RollDice(long playerId) {
    this.playerId = playerId;
  }

  @Override
  public void apply(MonopolyState state) {

  }

  @Override
  public void isLegal(MonopolyState state) {

  }

}
