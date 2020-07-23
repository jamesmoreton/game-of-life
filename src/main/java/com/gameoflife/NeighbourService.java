package com.gameoflife;

import com.gameoflife.model.Cell;

import java.util.List;

import static com.gameoflife.model.Grid.gridAtT;
import static com.gameoflife.model.Grid.isLastCellInRow;
import static com.gameoflife.model.Grid.isLastRowInGrid;
import static com.gameoflife.model.Grid.x;
import static com.gameoflife.model.Grid.y;

public class NeighbourService {

  static int calculate(List<Cell> row) {
    int neighboursOnRow;
    if (x == 0) {
      neighboursOnRow = row.get(x + 1).getState();
    } else if (isLastCellInRow()) {
      neighboursOnRow = row.get(x - 1).getState();
    } else {
      neighboursOnRow = row.get(x - 1).getState() + row.get(x + 1).getState();
    }

    int neighboursOnRowAbove;
    List<Cell> rowAbove;
    if (y == 0) {
      neighboursOnRowAbove = 0;
    } else {
      rowAbove = gridAtT.get(y - 1);
      if (x == 0) {
        neighboursOnRowAbove = rowAbove.get(x).getState() + rowAbove.get(x + 1).getState();
      } else if (isLastCellInRow()) {
        neighboursOnRowAbove = rowAbove.get(x - 1).getState() + rowAbove.get(x).getState();
      } else {
        neighboursOnRowAbove = rowAbove.get(x - 1).getState() + rowAbove.get(x).getState() + rowAbove.get(x + 1).getState();
      }
    }

    final int neighboursOnRowBelow;
    List<Cell> rowBelow;
    if (isLastRowInGrid()) {
      neighboursOnRowBelow = 0;
    } else {
      rowBelow = gridAtT.get(y + 1);
      if (x == 0) {
        neighboursOnRowBelow = rowBelow.get(x).getState() + rowBelow.get(x + 1).getState();
      } else if (isLastCellInRow()) {
        neighboursOnRowBelow = rowBelow.get(x - 1).getState() + rowBelow.get(x).getState();
      } else {
        neighboursOnRowBelow = rowBelow.get(x - 1).getState() + rowBelow.get(x).getState() + rowBelow.get(x + 1).getState();
      }
    }

    return neighboursOnRowAbove + neighboursOnRow + neighboursOnRowBelow;
  }
}
