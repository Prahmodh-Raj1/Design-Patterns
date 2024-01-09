package Facade_Pattern;

public class SecurityCodeCheck {
    private int getSecuritykey = 524;

    public int getSecurityKey() {
        return getSecuritykey;
    }
    public boolean isCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck==getSecurityKey()){
            return true;
        }
        else{
            return false;
        }
    }
}
