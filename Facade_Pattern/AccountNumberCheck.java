package Facade_Pattern;

public class AccountNumberCheck {

    private int getAccountNumber = 3425252;

    public int getAccountNumber() {
        return getAccountNumber;
    }
    public boolean accountActive(int accnumtoCheck){
        if(accnumtoCheck==getAccountNumber){
            return true;
        }
        else{
            return false;
        }
    }
}
