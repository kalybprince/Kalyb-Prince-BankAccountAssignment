public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.depositOrWithdraw("checking", 250.00);
        account1.depositOrWithdraw("checking", -50.00);
        System.out.println(account1.getCheckingBalance());

        account1.depositOrWithdraw("saving", 250.00);
        account1.depositOrWithdraw("saving", -50.00);
        System.out.println(account1.getSavingBalance());

        System.out.println(account1.accountsTotal());
    }
}