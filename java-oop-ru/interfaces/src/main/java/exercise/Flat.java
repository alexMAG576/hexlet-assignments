package exercise;

// BEGIN
public class Flat implements Home {

    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public double getArea() {
        return area + balconyArea;
    }
    public int compareTo(Home other) {
        if (this.getArea() == another.getArea()) {
            return  0;
        } else if (this.getArea() > another.getArea()) {
            return 1;
        }
        return -1;
    }
    public String toString() {
        return String.format("Квартира площадью " + getArea() + " метров на " + floor + " этаже");
    }
}
// END
