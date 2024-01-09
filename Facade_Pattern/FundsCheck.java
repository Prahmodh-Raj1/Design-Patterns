package Facade_Pattern;

public class FundsCheck {
    private double cashInAccount;

    public FundsCheck(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public double getCashInAccount() {
        return this.cashInAccount;
    }
    public void decreaseCashInAccount(double cashInAccount) {
        this.cashInAccount -= cashInAccount;
    }

    public void IncreaseCashInAccount(double cashInAccount) {
        this.cashInAccount += cashInAccount;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashInAccount < cashToWithdraw) {
            System.out.println("Error: Not enough money in the account!");
            return false;
        }else{
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal complete: current balance: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashDeposit){
        IncreaseCashInAccount(cashDeposit);
        System.out.println("Deposit complete: current balance: " + getCashInAccount());
    }
}
