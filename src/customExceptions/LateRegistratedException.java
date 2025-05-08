package customExceptions;

public class LateRegistratedException extends Exception {
    public LateRegistratedException() {
        super("Enrollment is not allowed after week 2.");
    }
}
