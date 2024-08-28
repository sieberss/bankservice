import java.math.BigDecimal;

public class Account {
    private static int counter = 100000000;
    private final String accountNumber;
    private BigDecimal balance;
    private final Client client;

    public Account(Client client) {
        this.client = client;
        accountNumber = client.firstName().substring(0,1).toUpperCase() + client.lastName().substring(0,1) + counter++;
        balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
