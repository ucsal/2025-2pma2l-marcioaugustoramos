package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account {

    @Override
    public boolean canWithdraw() {
        return true;
    }

    @Override
    public void withdraw(double amount) {
        if(balance < amount) throw new IllegalArgumentException("Saldo insuficiente");
        super.withdraw(amount);
    }
}