package Facade_Pattern;
import java.util.*;
public class TestBankAccount {
    public static void main(String[] args) {
        int checkinNumber = 3425252;
        int securityKey = 524;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial balance in the account");
        int initialBalance = sc.nextInt();
        BankAccountFacade accessBank = new BankAccountFacade(checkinNumber, securityKey,initialBalance);
        accessBank.withdrawCash(50.00);
        accessBank.withdrawCash(200.00);
        accessBank.depositCash(150.00);
    }
}
