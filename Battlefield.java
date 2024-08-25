public class Battlefield {
    private Tile[][] grid;

    public Battlefield(int width, int height) {
        grid = new Tile[width][height];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Tile("Grass"); // Example terrain type
            }
        }
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }

    public Tile getTile(int x, int y) {
        if (isValidPosition(x, y)) {
            return grid[x][y];
        }
        return null;
    }

    public boolean placeUnit(Unit unit, int x, int y) {
        if (isValidPosition(x, y) && grid[x][y].getUnitSymbol().equals(" ")) {
            grid[x][y].setUnitSymbol(unit.getSymbol());
            return true;
        }
        return false;
    }

    public boolean moveUnit(Unit unit, int oldX, int oldY, int newX, int newY) {
        if (isValidPosition(oldX, oldY) && isValidPosition(newX, newY)) {
            if (grid[oldX][oldY].getUnitSymbol().equals(unit.getSymbol()) && grid[newX][newY].getUnitSymbol().equals(" ")) {
                grid[oldX][oldY].removeUnit();
                grid[newX][newY].setUnitSymbol(unit.getSymbol());
                unit.move(newX, newY);
                return true;
            }
        }
        return false;
    }

    public void printBattlefield() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j].getUnitSymbol() + " ");
            }
            System.out.println();
        }
    }
}
