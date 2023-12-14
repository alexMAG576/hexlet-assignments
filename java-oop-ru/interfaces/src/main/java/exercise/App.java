package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        Collections.sort(apartments, Comparator.comparingDouble(Home::getArea));
        List<String>apartment = apartments.stream()
                .limit(n)
                .map(Home::toString)
                .collect(Collectors.toList());
        return apartment;
    }
}
// END
