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
        if (this.getArea() < other.getArea()) {
            return  -1;
        } else if (this.getArea() > other.getArea()) {
            return 1;
        }
        return 0;
    }
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
