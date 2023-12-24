package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    String tagName;
    Map<String, String> tagAtribut;

    public Tag(String tagName, Map<String, String> tagAtribut) {
        this.tagName = tagName;
        this.tagAtribut = tagAtribut;
    }

    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getTagAtribut() {
        return tagAtribut;
    }
}
// END
