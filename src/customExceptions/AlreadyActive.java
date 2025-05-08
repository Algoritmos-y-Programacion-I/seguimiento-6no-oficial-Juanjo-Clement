package customExceptions;

public class AlreadyActive extends Exception {
    public AlreadyActive() {
        super("This student has already been enrolled");
    }
}