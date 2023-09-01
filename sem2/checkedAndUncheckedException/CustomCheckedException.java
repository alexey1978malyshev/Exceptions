package sem2.checkedAndUncheckedException;

// Checked исключение
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

