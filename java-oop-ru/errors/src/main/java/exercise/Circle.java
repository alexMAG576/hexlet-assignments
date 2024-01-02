package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (this.getRadius() < 0) {
            throw new NegativeRadiusException("Radius can not be negative");
        }
        return Math.pow(radius, 2) * Math.PI;
    }
}
// END
