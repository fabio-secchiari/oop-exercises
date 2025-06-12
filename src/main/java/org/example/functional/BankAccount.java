package org.example.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    @AllArgsConstructor @Getter @Setter
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public void applyInterest(){
            amount += amount * interestRate;
        }
    }

    public static List<Account> applyInterest(List<Account> accounts){
        return accounts.stream()
            .filter(a -> a.duePayment.isBefore(LocalDateTime.now()))
            .peek(Account::applyInterest)
            .sorted((a1, a2) -> (int)a2.amount - (int)a1.amount)
            .collect(Collectors.toList());
    }
}
