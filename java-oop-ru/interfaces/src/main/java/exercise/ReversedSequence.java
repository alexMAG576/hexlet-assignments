package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String sequence;
    public ReversedSequence(String sequence) {
        this.sequence = sequence;
    }
    public int length() {
        return sequence.length();
    }
    public char charAt(int index) {
        return sequence.charAt(sequence.length() - 1 - index);
    }
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = end -1; i >= 0; i--) {
            sb.append(sequence.charAt(i));
        }
        return sb.toString();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = sequence.length() - 1; i >= 0; i--) {
            sb.append(sequence.charAt(i));
        }
        return sb.toString();
    }
}
// END
