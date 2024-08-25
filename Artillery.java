public class Artillery extends Unit {
    public Artillery() {
        super("$$"); // Example symbol and movement range
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Artillery moves to (" + x + ", " + y + ")");
    }
}
