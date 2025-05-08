package customExceptions;

public class NotAmmitedCancelation extends Exception {
    public NotAmmitedCancelation() {
        super("Cancellation not allowed. Student has more than 50% grades assigned.");
    }
}