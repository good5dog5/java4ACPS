package W5.builderPattern;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {

    private long accountNumber;
    private String owner;
    private double balance;

    public BankAccount(long accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
}
