package org.example.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double withdraw(double amount){
        amount = Math.min(amount, balance);
        return super.withdraw(amount);
    }

    @Override
    public double transfer(BankAccount other, double amount){
        String src = IBAN.substring(0, 2);
        String dst = other.getIBAN().substring(0, 2);
        if(!src.equals(dst)) throw new IllegalArgumentException("Only national transfer allowed");
        double maxWithdraw = withdraw(amount);
        other.deposit(maxWithdraw);
        return maxWithdraw;
    }
}
