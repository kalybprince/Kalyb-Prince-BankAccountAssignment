

public class BankAccount {
    private double checkingBalance = 0.0;
    private double savingBalance = 0.0;
    public static int numberOfAccounts = 0;
    public static double totalBankMoney = 0.0;

    public BankAccount() {
        numberOfAccounts++;
    }

    // GETTERS AND SETTERS

    // checking getter and setter
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public void setCheckingBalance(double cash) {
        // if cash is a negative int, check for sufficient funds
        if (cash >= 0) { // if positive value
            this.checkingBalance += cash;
            totalBankMoney += cash;
        } else { // if negative value
            if ((this.checkingBalance - cash) < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.checkingBalance += cash;
                totalBankMoney += cash;
            }
        }
    }

    // saving getter and setter
    public double getSavingBalance() {
        return this.savingBalance;
    }
    public void setSavingBalance(double cash) {
        // if cash is negative, check for sufficient funds
        if (cash >= 0) {
            this.savingBalance += cash;
            totalBankMoney += cash;
        } else {
            if ((this.savingBalance - cash) < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.savingBalance += cash;
                totalBankMoney += cash;
            }
        }
    }

    // CLASS METHODS
    public void depositOrWithdraw(String account, double moneyValue) {
        if (account == "checking") {
            setCheckingBalance(moneyValue);
        } else if (account == "saving") {
            setSavingBalance(moneyValue);
        } else {
            System.out.println("Invalid account type");
        }
    }

    public double accountsTotal() {
        return this.checkingBalance + this.savingBalance;
    }
}