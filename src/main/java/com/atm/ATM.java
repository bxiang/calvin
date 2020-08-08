package com.atm;
import java.util.Scanner;

public class ATM {
    int balance1;
    public ATM (int b){
    balance1 = b;

    }

    void deposit(int amount){
        if(amount !=0){
            balance1 += amount;
        }

    }
    void withdraw(int amount){
        if(amount != 0 && amount <= balance1){
            balance1 -= amount;
        }
        else{
            System.out.println("No");
        }
    }
}
