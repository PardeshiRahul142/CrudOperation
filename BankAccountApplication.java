import java.util.*;

interface BankService {
    void createAccount();
    void deposit();
    void withdraw();
    void showAccounts();
}

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = bal;
    }

    public int getAccNo() {
        return accountNumber;
    }

    public String getName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}

class BankServiceOperation implements BankService {
    BankAccount[] ba;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    BankServiceOperation(int size) {
        ba = new BankAccount[size];
    }

    public void createAccount() {
        if (count < ba.length) {
            System.out.println("Enter Account No, Name, Balance:");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double bal = sc.nextDouble();

            ba[count] = new BankAccount(id, name, bal);
            count++;
            System.out.println("Account created...");
        } else {
            System.out.println("Cannot create more accounts.");
        }
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        System.out.print("Enter deposit amount: ");
        double amt = sc.nextDouble();

        for (int i = 0; i < count; i++) {
            if (ba[i].getAccNo() == id) {
                ba[i].deposit(amt);
                System.out.println("Deposited successfully. New Balance: " + ba[i].getBalance());
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        System.out.print("Enter withdraw amount: ");
        double amt = sc.nextDouble();

        for (int i = 0; i < count; i++) {
            if (ba[i].getAccNo() == id) {
                if (ba[i].withdraw(amt)) {
                    System.out.println("Withdraw successful. New Balance: " + ba[i].getBalance());
                } else {
                    System.out.println("Insufficient balance!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void showAccounts() {
        System.out.println("Accounts with balance > 5000:");
        for (int i = 0; i < count; i++) {
            if (ba[i].getBalance() > 5000) {
                System.out.println("AccNo: " + ba[i].getAccNo() + "  Name: " + ba[i].getName() + "  Balance: " + ba[i].getBalance());
            }
        }
    }
}

public class BankAccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankServiceOperation bo = new BankServiceOperation(3); // create 3 accounts

        while (true) {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Accounts with Balance > 5000");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: bo.createAccount(); break;
                case 2: bo.deposit(); break;
                case 3: bo.withdraw(); break;
                case 4: bo.showAccounts(); break;
                case 5: System.out.println("Exit..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
