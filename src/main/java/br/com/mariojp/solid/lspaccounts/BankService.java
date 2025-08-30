package br.com.mariojp.solid.lspaccounts;


public class BankService {
    public void processWithdrawal(Account acc, double amount){
        if(acc.canWithdraw()) {
            acc.withdraw(amount);
        }
        //nao faz nada caso nao precise sacar
    }
}