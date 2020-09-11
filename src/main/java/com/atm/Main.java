package com.atm;

import java.util.Scanner;

public class Main {
    void printMenu() {
        System.out.println("");
        System.out.println("A. Deposit");
        System.out.println("B. Withdraw");
        System.out.println("C. Check Balance");
        System.out.println("D. Quit");
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner n = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String b = n.next();
        System.out.println(b);
        int balance = 10000;
        main.printMenu();

        ATM e = new ATM(balance);
        char option = '\0';

        while (option != 'D') {
            System.out.println("");
            System.out.print("Enter an Option: ");
            option = n.next().toUpperCase().charAt(0);


            switch (option) {
                case 'A':
                    System.out.print("Enter Deposit Amount: ");
                    int deposit = n.nextInt();
                    e.deposit(deposit);
                    System.out.println("Your Updated Balance is: " + e.balance1);
                    break;
                case 'B':
                    System.out.print("Enter Withdraw Amount: ");
                    int withdraw = n.nextInt();
                    e.withdraw(withdraw);
                    System.out.println("Your Updated Balance is: " + e.balance1);
                    break;
                case 'C':
                    System.out.println("Your Current Balance is:" + e.balance1);
            }
            if(option != 'D') {
                main.printMenu();
            }

        }
        System.out.println("Goodbye");
    }


}
// Deposit
// Withdraw
// Check Balance
// Quit