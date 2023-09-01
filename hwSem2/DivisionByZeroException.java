package hwSem2;

// Класс исключения для деления на ноль
class DivisionByZeroException extends Exception {


    public DivisionByZeroException(String message) {
        super(message);

    }
}