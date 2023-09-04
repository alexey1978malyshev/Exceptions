package sem3.task4;

public class Account {
    private long number;
    private int amount;

    public Account(long number, int amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("You can't create account with negative balance.");
        }
        this.number = number;
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    public long getNumber() {
        return number;
    }

    public void withdraw(int sum) throws InsufficientFundsException, NegativeAmountException {
        if (sum >= this.amount) {
            throw new InsufficientFundsException();
        }
        if (sum <= 0){
            throw new NegativeAmountException("Can't withdraw negative sum");
        }
        this.amount-=sum;
    }
    public void deposit(int sum) throws NegativeAmountException{
        if (sum < 0) {
            throw new NegativeAmountException("Can't deposit negative sum");
        }
        this.amount+=sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", amount=" + amount +
                '}';
    }
}



