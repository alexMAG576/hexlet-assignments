package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    String text;
    List<Tag> listOfChild;

    public PairedTag(String tagName,
                     Map<String, String> tagAtribut,
                     String text,
                     List<Tag> listOfChild) {
        super(tagName, tagAtribut);
        this.text = text;
        this.listOfChild = listOfChild;
    }

    public String getText() {
        return text;
    }

    public List<Tag> getListOfChild() {
        return listOfChild;
    }
    public String toString() {
        String result = "";
        var entries = tagAtribut.entrySet();
        for (var entry : entries) {
            result += " " + entry.getKey() + "=\"" + entry.getValue() + "\"";
        } if (listOfChild.size() != 0) {
            String resultTag = listOfChild.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(""));
            return "<" + tagName + result + ">" + text + resultTag +"</" + tagName + ">";
        }
        return "<" + tagName + result + ">" + text + "</" + tagName + ">";
    }
}
// END
