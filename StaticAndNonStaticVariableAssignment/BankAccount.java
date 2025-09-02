package StaticAndNonStaticVariableAssignment;

import java.util.Scanner;

class BankAccount {
    int accountNumber;           // instance variable
    String accountHolderName;    // instance variable
    double balance;              // instance variable

    // method with local variable
    void deposit(double amount) {
        double newBalance = balance + amount; // local variable newBalance
        balance = newBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        //we have to implement program logic here
    }
}

