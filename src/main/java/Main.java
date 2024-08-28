import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client kurt = new Client("Kurt", "Schulze", 2);
        Account kurtsAccount = new Account(kurt);
        System.out.println(kurtsAccount);
        kurtsAccount.deposit(new BigDecimal(270));
        System.out.println(kurtsAccount);
        kurtsAccount.withdraw(new BigDecimal(170));
        System.out.println(kurtsAccount);
    }
}
