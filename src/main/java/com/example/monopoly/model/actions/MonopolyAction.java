package com.example.monopoly.model.actions;

import com.example.monopoly.model.state.MonopolyState;

public interface MonopolyAction {

  void apply(final MonopolyState state);

  void isLegal(final MonopolyState state);

}
