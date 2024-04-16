package ATM;
import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        System.out.println("---------------WELCOME---------------");
        Scanner sc=new Scanner(System.in);
        ArrayList<BankDetails> bankDetails=new ArrayList<>();
        bankDetails.add(new BankDetails("KVB",123456,1234,50000));
        bankDetails.add(new BankDetails("SBI",234567,2345,10000));
        bankDetails.add(new BankDetails("KVB",345678,3456,30000));

        System.out.println("Choose your user type:\n1->Admin\n2->Bank\n3->Customer");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Admin admin = new Admin(bankDetails);
                admin.adminRole();
                break;
            case 2:
                Bank bank = new Bank(bankDetails);
                bank.bankRole();
                break;
            case 3:
                Customer customer=new Customer(bankDetails);
                customer.customerRole();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
