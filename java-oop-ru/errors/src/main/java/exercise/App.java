package exercise;

// BEGIN
class App {
    public static int printSquare(Circle circle) throws NegativeRadiusException {
        if (circle.getRadius() < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        int squareCircle = (int) circle.getSquare();
        System.out.println(squareCircle);
        System.out.println("Вычисление окончено");
    }
}
// END
