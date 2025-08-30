package br.com.mariojp.solid.lspaccounts;

public abstract class Account {
    protected double balance;

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    // cada subclasse decide se tem saque
    public abstract boolean canWithdraw();
    
    public void withdraw(double amount){
        this.balance -= amount;
    }
}