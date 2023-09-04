package sem3.task4;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("The account hasn't enough money.");
    }
}
