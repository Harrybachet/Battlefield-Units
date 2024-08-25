public class Tile {
    private String unitSymbol; // Represents the unit with a special character
    private String terrainType;

    public Tile(String terrainType) {
        this.terrainType = terrainType;
        this.unitSymbol = " "; // No unit by default
    }

    public String getUnitSymbol() {
        return unitSymbol;
    }

    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    public void removeUnit() {
        this.unitSymbol = " "; // Remove unit
    }

    public String getTerrainType() {
        return terrainType;
    }
}
