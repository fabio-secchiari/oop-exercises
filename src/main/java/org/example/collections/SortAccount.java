package org.example.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class SortAccount {
    @Getter @Setter @AllArgsConstructor
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;
    }

    public static void sortByAmount(List<Account> accounts){
        accounts.sort(Comparator.comparingDouble(Account::getAmount));
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort(Comparator.comparingDouble(Account::getInterestRate));
    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort(Comparator.comparing(Account::getDuePayment));
    }
}
