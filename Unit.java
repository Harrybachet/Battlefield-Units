import java.util.Random;

public abstract class Unit {
    protected String symbol;
    protected int movementRange;

    private Random random = new Random();

    public Unit(String symbol) {
        this.symbol = symbol;
        this.movementRange = movementRange;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getMovementRange() {
        return movementRange;
    }

    public abstract void move(int x, int y);

    public void moveRandomly(Battlefield battlefield, int currentX, int currentY) {
        int[] directions = {-1, 0, 1};
        int randomDirectionX = directions[random.nextInt(directions.length)];
        int randomDirectionY = directions[random.nextInt(directions.length)];

        int newX = currentX + randomDirectionX;
        int newY = currentY + randomDirectionY;

        if (Math.abs(randomDirectionX) <= movementRange && Math.abs(randomDirectionY) <= movementRange && battlefield.isValidPosition(newX, newY) && battlefield.getTile(newX, newY).getUnitSymbol().equals(" ")) {
            battlefield.moveUnit(this, currentX, currentY, newX, newY);
        }
    }
}
