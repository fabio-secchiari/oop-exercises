package org.example.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    protected BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        applyFee();
    }
    @Override
    public double withdraw(double amount){
        double withdrew = super.withdraw(amount);
        applyFee();
        return withdrew;
    }
}
