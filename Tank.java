public class Tank extends Unit {
    public Tank() {
        super("%"); // Example symbol and movement range
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Tank moves to (" + x + ", " + y + ")");
    }
}
