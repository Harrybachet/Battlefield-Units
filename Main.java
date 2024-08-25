public class Main {
    public static void main(String[] args) {
        Battlefield battlefield = new Battlefield(10, 10);
        Unit infantry = new Infantry();
        Unit tank = new Tank();
        Unit aircraft = new Aircraft();
        Unit artillery = new Artillery();

        // Place units
        battlefield.placeUnit(infantry, 2, 3);
        battlefield.placeUnit(tank, 4, 5);
        battlefield.placeUnit(aircraft, 6, 7);
        battlefield.placeUnit(artillery, 8, 9);

        // Print initial battlefield
        System.out.println("Initial Battlefield:");
        battlefield.printBattlefield();

        // Move units randomly
        infantry.moveRandomly(battlefield, 2, 3);
        tank.moveRandomly(battlefield, 4, 5);
        aircraft.moveRandomly(battlefield, 6, 7);
        artillery.moveRandomly(battlefield, 8, 9);

        // Print battlefield after moves
        System.out.println("Battlefield After Random Moves:");
        battlefield.printBattlefield();
    }
}
