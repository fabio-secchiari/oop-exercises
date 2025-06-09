package org.example.oop.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if(amount > 0) this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance < amount){
            throw new IllegalArgumentException("Impossibile prelevare più di ciò che si possiede");
        }
        this.balance -= amount;
    }
}
