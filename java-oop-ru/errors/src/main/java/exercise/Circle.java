package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public int getRadius() {
        return radius;
    }
    public double getSquare() {
        return radius * radius * Math.PI;
    }
}
// END
