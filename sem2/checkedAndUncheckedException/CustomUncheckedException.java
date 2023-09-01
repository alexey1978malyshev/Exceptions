package sem2.checkedAndUncheckedException;

// Unchecked исключение
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}
