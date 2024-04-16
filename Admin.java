package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    int password=123;
    int pass;
    ArrayList<BankDetails> bankDetails;
    Scanner sc=new Scanner(System.in);
    Admin(ArrayList<BankDetails> bankDetails){
        this.bankDetails=bankDetails;
        System.out.println("Enter admin password:");
        pass=sc.nextInt();
    }
    void adminRole(){
        if(pass!=password){
            System.out.println("Invalid password!");
            return;
        }
        String str="yes";
        while(str.equals("yes")) {
            System.out.println("Enter the operation:\n1->Add Bank Details\n2->Display Bank Details");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    addBankDetails();
                    break;
                case 2:
                    getAllBankDetails();
                    break;
            }
            System.out.println("Do you want to continue?yes/no");
            str=sc.next();
        }
    }
    void addBankDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bank name:");
        String bn=sc.next();
        System.out.println("Enter account number:");
        int an=sc.nextInt();
        System.out.println("Enter pin number:");
        int pin=sc.nextInt();
        System.out.println("Enter amount:");
        double amt=sc.nextDouble();
        bankDetails.add(new BankDetails(bn,an,pin,amt));
    }
    void getAllBankDetails(){
        System.out.println("---------------BANK DETAILS---------------");
        for(BankDetails b:bankDetails){
            System.out.println("Name-"+b.getBankName()+" Account No.-"+b.getAccNo()+" Pin-"+b.getPin()+" Balance-"+b.getBalance());
        }
    }
}
