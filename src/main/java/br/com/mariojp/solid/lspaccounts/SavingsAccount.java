package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account {

    @Override
    public boolean canWithdraw() {
        return false;
    }

   
    @Override
    public void withdraw(double amount) {
        // ignorado, pois poupança não permite saque
    }
}
	