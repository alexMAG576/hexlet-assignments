package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public int getFloorCount() {
        return floorCount;
    }
    public String toString() {
        return String.format(floorCount + " этажный коттедж площадью " + getArea() + " метров");
    }
    public int compareTo(Home another) {
        if (area == another.getArea()) {
            return 0;
        }

        if (area > another.getArea()) {
            return 1;
        }

        return -1;
    }
}
// END
