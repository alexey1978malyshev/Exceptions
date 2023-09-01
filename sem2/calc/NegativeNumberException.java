package sem2.calc;

// Класс исключения для отрицательных чисел
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}