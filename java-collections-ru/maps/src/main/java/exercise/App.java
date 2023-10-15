package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split(" ");
        int identicalOfWords = 0;
        for (String word : words) {
            if (!word.isBlank()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, identicalOfWords) + 1);
            }
        }
        return wordCountMap;
    }

    public static String toString(Map<String, Integer> dictionary) {
        StringBuilder sb = new StringBuilder("{\n");
        if (dictionary.size() == 0) {
            sb = new StringBuilder("{");
        }
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {

            sb.append("  " + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
//END
