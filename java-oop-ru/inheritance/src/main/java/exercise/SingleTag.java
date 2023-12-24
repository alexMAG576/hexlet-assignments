package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagAtribut) {
        super(tagName, tagAtribut);
    }
    public String toString() {
        String result = "";
        var entries = tagAtribut.entrySet();
        for (var entry : entries) {
            String entryTag = entry.getKey() + "=\"" + entry.getValue() + "\"";
            result += " " + entryTag;
        }
        return "<" + tagName + result + ">";
    }
}
// END
