package com.gameoflife.model;

import java.util.List;

public class Grid {

  public static List<List<Cell>> gridAtT = Patterns.glider; // Update me
  public static List<List<Cell>> gridAtTPlusOne;

  private static final int maxGridHeight = gridAtT.size() - 1;
  private static final int maxGridWidth = gridAtT.get(0).size() - 1;

  public static int x = 0;
  public static int y = 0;
  public static int t = 0;

  public static boolean isLastRowInGrid() {
    return y == maxGridHeight;
  }

  public static boolean isLastCellInRow() {
    return x == maxGridWidth;
  }
}
