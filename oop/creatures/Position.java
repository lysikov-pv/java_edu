package oop.creatures;

public class Position {
    int x; // 1..15
    int y; // 1..11

    public double getDistance(Position nextPosition) {
        int dx = nextPosition.x - x;
        int dy = nextPosition.y - y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
