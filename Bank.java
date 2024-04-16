package ATM;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Bank {
    String BankName;
    int password=456;
    ArrayList<BankDetails> bankDetails;
    Map<String,Integer> bank=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    Bank(ArrayList<BankDetails> bankDetails){
        this.bankDetails=bankDetails;
        System.out.println("Enter the bank name:");
        BankName=sc.next();
        System.out.println("Enter the password:");
        password=sc.nextInt();
        bank.put("KVB",1);bank.put("SBI",2);bank.put("IOB",3);
    }
    void bankRole() {
        if (!bank.containsKey(BankName) || bank.get(BankName) != password) {
            System.out.println("Invalid bank name or password!");
            return;
        }
       /* String str = "yes";
        while (str.equals("yes")) {*/
            getBankDetails();
        /*    System.out.println("Do you want to continue?yes/no");
            str=sc.next();
        }*/
    }
    void getBankDetails(){
        System.out.println("Name-"+BankName);
        for(BankDetails b:bankDetails){
            if(b.getBankName().equals(BankName)){
                System.out.println("Account no.-"+b.getAccNo()+" Balance-"+b.getBalance());
            }
        }
    }
}
