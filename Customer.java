package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    int pin,accno;
    ArrayList<BankDetails> bankDetails;
    Scanner sc= new Scanner(System.in);
    Customer(ArrayList<BankDetails> bankDetails){
        this.bankDetails=bankDetails;
        System.out.println("Enter Account Number:");
        accno=sc.nextInt();
        System.out.println("Enter 4 digit pin number:");
        pin=sc.nextInt();
    }
    void customerRole(){
        int fl=0;
        for(BankDetails b:bankDetails){
            if(b.getPin()==pin && b.getAccNo()==accno){
                fl=1;
                String str="yes";
                while(str.equals("yes")) {
                    System.out.println("Enter the opertion:\n1->Withdraw\n2->Deposit\n3->Balance\n4->Pin change");
                    int op = sc.nextInt();
                    switch (op) {
                        case 1:
                            withdraw(b);
                            break;
                        case 2:
                            deposit(b);
                            break;
                        case 3:
                            balance(b);
                            break;
                        case 4:
                            pinChange(b);
                            break;
                    }
                    System.out.println("Do you want to continue?yes/no");
                    str=sc.next();
                }
            }
        }
        if(fl==0){
            System.out.println("Invalid Account number or Pin!");
        }
    }
    void withdraw(BankDetails b){
        System.out.println("Enter the amount to withdraw:");
        double amt=sc.nextDouble();
        double bal=b.getBalance();
        if(amt>bal){
            System.out.println("Insufficient balance!");
            return;
        }
        System.out.println("Successfully withdrawn!");
        b.setBalance(bal-amt);
    }
    void deposit(BankDetails b){
        System.out.println("Enter the amount to deposit:");
        double amt=sc.nextDouble();
        double bal=b.getBalance();
        System.out.println("Successfully deposited!");
        b.setBalance(bal+amt);
    }
    void balance(BankDetails b){
        System.out.println("Your balance is "+b.getBalance());
    }
    void pinChange(BankDetails b){
        System.out.println("Enter new pin:");
        int p=sc.nextInt();
        System.out.println("Your pin is successfully set!");
        b.setPin(p);
    }


}
