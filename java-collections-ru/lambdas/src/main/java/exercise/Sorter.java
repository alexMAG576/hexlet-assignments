package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(map1 -> map1.get("gender").equals("male"))
                .sorted(Comparator.comparingLong(map2 -> LocalDate.parse(map2.get("birthday")).toEpochDay()))
                .map(map3 -> map3.get("name"))
                .collect(Collectors.toList());
    }
}

// END
