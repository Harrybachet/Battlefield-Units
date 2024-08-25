public class Aircraft extends Unit {
    public Aircraft() {
        super("@"); // Example symbol and movement range
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Aircraft moves to (" + x + ", " + y + ")");
    }
}
