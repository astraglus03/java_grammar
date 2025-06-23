package C04Interface.BankService;

public class BankService {
    public void deposit(long money, BankAccount account){
        account.updateBalance(account.getBalance() + money);
    }

    public boolean withdraw(long money, BankAccount account){
        if(account.getBalance() >=money){
            account.updateBalance(account.getBalance() - money);
            return true;
        }
        else{
            System.out.println("잔액이 부족합니다.");
            return false;
        }
    }
}
