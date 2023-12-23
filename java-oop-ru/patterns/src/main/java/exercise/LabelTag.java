package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface inputTag;

    public LabelTag(String text, TagInterface inputTag) {
        this.text = text;
        this.inputTag = inputTag;
    }

    public String getText() {
        return text;
    }
    public String render() {
        return "<label>" + text + inputTag.render() +"</label>";
    }
}
// END
