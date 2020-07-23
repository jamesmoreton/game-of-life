package com.gameoflife;

import com.gameoflife.model.Cell;

import java.util.LinkedList;
import java.util.List;

import static com.gameoflife.model.Grid.gridAtT;
import static com.gameoflife.model.Grid.gridAtTPlusOne;
import static com.gameoflife.model.Grid.isLastCellInRow;
import static com.gameoflife.model.Grid.t;
import static com.gameoflife.model.Grid.x;
import static com.gameoflife.model.Grid.y;

public class Life {

  private static final int GENERATIONS = 25;
  private static final long GEN_INTERVAL = 500;

  void simulate() {
    for (int gen = 0; gen < GENERATIONS; gen++) {
      gridAtTPlusOne = new LinkedList<>();

      for (List<Cell> row : gridAtT) {
        printCellsOnRow(row);
        x = 0; // Reset x coordinate
        y++; // Increment y coordinate
      }

      System.out.print("t = " + t);
      y = 0; // Reset y coordinate
      t++; // Increment t
      gridAtT = gridAtTPlusOne; // Update current table with t+1

      try {
        Thread.sleep(GEN_INTERVAL); // Pause
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void printCellsOnRow(List<Cell> row) {
    for (Cell cell : row) {
      printCell(cell);

      int neighbours = NeighbourService.calculate(row);
      Cell cellAtTPlusOne = SurvivalService.calculate(cell, neighbours);
      updateTableAtTPlusOne(cellAtTPlusOne);

      x++; // Increment x coordinate
    }
  }

  private void printCell(Cell cell) {
    String toPrint = cell.isAlive() ? "■" : " ";
    String leftPad = x == 0 && y == 0 ? "\n" : "";
    String rightPad = isLastCellInRow() ? "\n" : "  ";
    System.out.print(leftPad + toPrint + rightPad);
  }

  private void updateTableAtTPlusOne(Cell cellAtTPlusOne) {
    if (x == 0) {
      gridAtTPlusOne.add(y, new LinkedList<>());
    }
    gridAtTPlusOne.get(y).add(x, cellAtTPlusOne);
  }
}
