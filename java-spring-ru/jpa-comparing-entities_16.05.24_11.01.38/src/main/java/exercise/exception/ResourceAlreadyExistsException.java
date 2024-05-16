package exercise.exception;

// BEGIN
public class ResourceAlredyExistsException extends RuntimeException {
    public ResourceAlredyExistsException(String message) {
        super(message);
    }
}
// END
