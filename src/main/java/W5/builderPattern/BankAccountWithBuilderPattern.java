package W5.builderPattern;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
public class BankAccountWithBuilderPattern {
    private final long accountNumber;
    private final String owner;
    private final String branch;
    private final double balance;
    private final double interestRate;

    public static class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return  this;
        }

        public BankAccountWithBuilderPattern build() {
            return new BankAccountWithBuilderPattern(this);
        }

    }

    private BankAccountWithBuilderPattern(Builder builder) {
        accountNumber = builder.accountNumber;
        owner = builder.owner;
        branch = builder.branch;
        balance = builder.balance;
        interestRate = builder.interestRate;

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
