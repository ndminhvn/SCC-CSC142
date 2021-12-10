package coordinate;

public class Point {
    private int x, y;
    public Point() {
        this(0,0);
    }
    public Point(Point other) {
        this(other.x, other.y);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Point setLocation(int new_x, int new_y) {
        return new Point(new_x, new_y);
    }
    public Point move(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
    public double distance(Point other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("division by zero");
        } else {
            double dy = this.y - other.y;
            double dx = this.x - other.x;
            return dy / dx;
        }
    }
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return other.x == x && other.y == y;
        } else {
            return false;
        }
    }
    public boolean isCollinear(Point p1, Point p2) {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            return slope(p1) == slope(p2);
        }
    }
    public boolean isHorizontal(Point other) {
        return this.y == other.y;
    }
    public boolean isVertical(Point other) {
        return this.x == other.x;
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
