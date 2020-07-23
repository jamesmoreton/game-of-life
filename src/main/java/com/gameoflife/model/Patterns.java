package com.gameoflife.model;

import java.util.LinkedList;
import java.util.List;

public class Patterns {

  private static final List<Integer> A_1 = new LinkedList<>(List.of(0, 0, 0, 0));
  private static final List<Integer> A_2 = new LinkedList<>(List.of(0, 1, 1, 0));
  private static final List<Integer> A_3 = new LinkedList<>(List.of(0, 1, 1, 0));
  private static final List<Integer> A_4 = new LinkedList<>(List.of(0, 0, 0, 0));

  private static final List<Integer> B_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0));
  private static final List<Integer> B_2 = new LinkedList<>(List.of(0, 0, 1, 1, 0, 0));
  private static final List<Integer> B_3 = new LinkedList<>(List.of(0, 1, 0, 0, 1, 0));
  private static final List<Integer> B_4 = new LinkedList<>(List.of(0, 0, 1, 1, 0, 0));
  private static final List<Integer> B_5 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0));

  private static final List<Integer> C_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0));
  private static final List<Integer> C_2 = new LinkedList<>(List.of(0, 0, 1, 0, 0));
  private static final List<Integer> C_3 = new LinkedList<>(List.of(0, 1, 0, 1, 0));
  private static final List<Integer> C_4 = new LinkedList<>(List.of(0, 0, 1, 0, 0));
  private static final List<Integer> C_5 = new LinkedList<>(List.of(0, 0, 0, 0, 0));

  private static final List<Integer> D_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0));
  private static final List<Integer> D_2 = new LinkedList<>(List.of(0, 0, 0, 0, 0));
  private static final List<Integer> D_3 = new LinkedList<>(List.of(0, 1, 1, 1, 0));
  private static final List<Integer> D_4 = new LinkedList<>(List.of(0, 0, 0, 0, 0));
  private static final List<Integer> D_5 = new LinkedList<>(List.of(0, 0, 0, 0, 0));

  private static final List<Integer> E_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0));
  private static final List<Integer> E_2 = new LinkedList<>(List.of(0, 1, 1, 0, 0, 0));
  private static final List<Integer> E_3 = new LinkedList<>(List.of(0, 1, 0, 0, 0, 0));
  private static final List<Integer> E_4 = new LinkedList<>(List.of(0, 0, 0, 0, 1, 0));
  private static final List<Integer> E_5 = new LinkedList<>(List.of(0, 0, 0, 1, 1, 0));
  private static final List<Integer> E_6 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0));

  private static final List<Integer> F_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_2 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_3 = new LinkedList<>(List.of(0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0));
  private static final List<Integer> F_4 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_5 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_6 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_7 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_8 = new LinkedList<>(List.of(0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0));
  private static final List<Integer> F_9 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_10 = new LinkedList<>(List.of(0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0));
  private static final List<Integer> F_11 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_12 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_13 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0));
  private static final List<Integer> F_14 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_15 = new LinkedList<>(List.of(0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0));
  private static final List<Integer> F_16 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> F_17 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

  private static final List<Integer> G_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_2 = new LinkedList<>(List.of(0, 0, 1, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_3 = new LinkedList<>(List.of(0, 0, 0, 1, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_4 = new LinkedList<>(List.of(0, 1, 1, 1, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_5 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_6 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_7 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_8 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_9 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> G_10 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

  private static final List<Integer> H_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_2 = new LinkedList<>(List.of(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_3 = new LinkedList<>(List.of(0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_4 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_5 = new LinkedList<>(List.of(0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_6 = new LinkedList<>(List.of(0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_7 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_8 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> H_9 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

  private static final List<Integer> I_1 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_2 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_3 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_4 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0));
  private static final List<Integer> I_5 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0));
  private static final List<Integer> I_6 = new LinkedList<>(List.of(0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_7 = new LinkedList<>(List.of(0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_8 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_9 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_10 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_11 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_12 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_13 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_14 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
  private static final List<Integer> I_15 = new LinkedList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

  // Still lifes
  public static final List<List<Cell>> block = transform(new LinkedList<>(List.of(A_1, A_2, A_3, A_4)));
  public static final List<List<Cell>> beehive = transform(new LinkedList<>(List.of(B_1, B_2, B_3, B_4, B_5)));
  public static final List<List<Cell>> tub = transform(new LinkedList<>(List.of(C_1, C_2, C_3, C_4, C_5)));

  // Oscillators
  public static final List<List<Cell>> blinker = transform(new LinkedList<>(List.of(D_1, D_2, D_3, D_4, D_5)));
  public static final List<List<Cell>> beacon = transform(new LinkedList<>(List.of(E_1, E_2, E_3, E_4, E_5, E_6)));
  public static final List<List<Cell>> pulsar = transform(new LinkedList<>(List.of(F_1, F_2, F_3, F_4, F_5, F_6, F_7, F_8, F_9, F_10, F_11, F_12, F_13, F_14, F_15, F_16, F_17)));

  // Spaceships
  public static final List<List<Cell>> glider = transform(new LinkedList<>(List.of(G_1, G_2, G_3, G_4, G_5, G_6, G_7, G_8, G_9, G_10)));
  public static final List<List<Cell>> heavyWeightSpaceship = transform(new LinkedList<>(List.of(H_1, H_2, H_3, H_4, H_5, H_6, H_7, H_8, H_9)));

  // Guns
  public static final List<List<Cell>> gosperGliderGun = transform(new LinkedList<>(List.of(I_1, I_2, I_3, I_4, I_5, I_6, I_7, I_8, I_9, I_10, I_11, I_12, I_13, I_14, I_15)));

  private static List<List<Cell>> transform(List<List<Integer>> grid) {
    List<List<Cell>> cellGrid = new LinkedList<>(new LinkedList<>());
    grid.forEach(row -> {
      List<Cell> cellRow = new LinkedList<>();
      row.forEach(c -> cellRow.add(new Cell(c)));
      cellGrid.add(cellRow);
    });
    return cellGrid;
  }
}
