package W5.builderPattern;



public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(12345L, "Jordan", 1000000.00);
        BankAccount bankAccount2 = new BankAccount(12345L, "Jordan", 1000000.00);
        System.out.println(bankAccount1.getAccountNumber());


        BankAccountWithBuilderPattern bankAccount3 = new BankAccountWithBuilderPattern.Builder(15678L)
                .atBranch("Taiwan")
                .atRate(3379)
                .openingBalance(327)
                .build();

        BankAccountWithBuilderPattern bankAccount4 = new BankAccountWithBuilderPattern.Builder(434234L)
                .atRate(434242)
                .withOwner("Jordan 2")
                .build();


        System.out.println(bankAccount3);
        System.out.println(bankAccount4);
    }


}
