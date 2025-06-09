package org.example.oop.bankaccount;

public interface BankAccount {
    String getIBAN();
    void setIBAN(String IBAN);
    double getBalance();
    void setBalance(double balance);
    double getOperationFee();
    void setOperationFee(double operationFee);
    double getInterestRate();
    void setInterestRate(double interestRate);
    void deposit(double amount);
    double withdraw(double amount);
    double transfer(BankAccount other, double amount);
    void addInterest();
    void applyFee();

    static void checkIBAN(String IBAN){
        if(IBAN.length() < 8 || IBAN.length() > 34 || Character.isLowerCase(IBAN.charAt(0)) || Character.isLowerCase(IBAN.charAt(1))){
            throw new IllegalArgumentException("IBAN format invalid");
        }
    }
}
