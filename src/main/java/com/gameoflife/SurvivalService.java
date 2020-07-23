package com.gameoflife;

import com.gameoflife.model.Cell;

public class SurvivalService {

  static Cell calculate(Cell cell, int neighbours) {
    // Assume death by underpopulation (neighbours < 2) or overpopulation (neighbours > 3)
    Cell cellAtTPlusOne = new Cell(0);

    // Survives to next generation
    if (cell.isAlive() && (neighbours == 2 || neighbours == 3)) {
      cellAtTPlusOne = cell;
    }

    // Becomes live cell by reproduction
    if (!cell.isAlive() && neighbours == 3) {
      cellAtTPlusOne = new Cell(1);
    }

    return cellAtTPlusOne;
  }
}
