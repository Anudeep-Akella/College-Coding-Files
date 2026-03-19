import java.util.Scanner;

// Base class
class Account {
    int accountNumber;
    double balance;

    void createAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class BankAccount extends Account {

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        acc.createAccount(101, 5000);
        acc.display();

        acc.deposit(2000);
        acc.withdraw(1500);

        sc.close();
    }
}
