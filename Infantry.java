public class Infantry extends Unit {
    public Infantry() {
        super("||"); // Example symbol and movement range
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Infantry moves to (" + x + ", " + y + ")");
    }
}

