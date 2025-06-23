package C04Interface.BankService;

public class BankServiceOriginal {
    public void deposit(long money, BankAccount account){
        account.updateBalance(account.getBalance() + money);
    }

    public boolean withdraw(long money, BankAccount account){
        if(account.getBalance() >=money){
            account.updateBalance(account.getBalance() - money);
            return true;
        }
        else{
            return false;
        }
    }
}
