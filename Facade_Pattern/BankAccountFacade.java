package Facade_Pattern;

public class BankAccountFacade {

    private int accountNumber;
    private int SecurityKey;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck secChecker;
    FundsCheck fundChecker;

    WelcomeBank bankWelcome;

    public BankAccountFacade(int newAccountNumber, int newSecurityKey,int initialAmount){
        accountNumber = newAccountNumber;
        SecurityKey = newSecurityKey;
        bankWelcome = new WelcomeBank();
        acctChecker= new AccountNumberCheck();
        secChecker= new SecurityCodeCheck();
        fundChecker = new FundsCheck(initialAmount);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getSecurityKey(){
        return SecurityKey;
    }
    public void withdrawCash(double cashToWithdraw){
        if(acctChecker.accountActive(accountNumber)){
            if(secChecker.isCodeCorrect(SecurityKey)){
                if(fundChecker.haveEnoughMoney(cashToWithdraw)){
                    fundChecker.makeDeposit(cashToWithdraw);
                    System.out.println("Transaction successfull");
                    return;
                }
            }
        }
        System.out.println("Transaction Failed");
    }
    public void depositCash(double cashToDeposit){
        if(acctChecker.accountActive(accountNumber) && secChecker.isCodeCorrect(SecurityKey)){
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction successful");
        }else System.out.println("Transaction Failed");
    }


}
