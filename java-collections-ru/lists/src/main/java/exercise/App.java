package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String randomChar, String word) {
        word = word.toLowerCase();
        List<Character> charList = new ArrayList<>();
        for (char c : randomChar.toCharArray()) {
            charList.add(c);
        }
        for (char c : word.toCharArray()) {
            if (!charList.contains(c)) {
                return false;
            }
            charList.remove(Character.valueOf(c));
        }
        return true;
    }
}

//END
