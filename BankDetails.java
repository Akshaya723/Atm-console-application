package ATM;

public class BankDetails {
    String BankName;
    int AccNo;
    int Pin;
    double Balance;
    BankDetails(String bn,int an,int pn,double bl){
        this.BankName=bn;
        this.AccNo=an;
        this.Pin=pn;
        this.Balance=bl;
    }
    String getBankName(){
        return BankName;
    }
    int getAccNo(){
        return AccNo;
    }
    int getPin(){
        return Pin;
    }
    double getBalance(){
        return Balance;
    }
    void setBalance(double bal){
        this.Balance=bal;
    }
    void setPin(int pin){
        this.Pin=pin;
    }
}
