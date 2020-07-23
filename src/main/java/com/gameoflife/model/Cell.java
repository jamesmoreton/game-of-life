package com.gameoflife.model;

public class Cell {

  private final int state;

  public Cell(
      int state
  ) {
    this.state = state;
  }

  public int getState() {
    return state;
  }

  public boolean isAlive() {
    return state == 1;
  }
}
