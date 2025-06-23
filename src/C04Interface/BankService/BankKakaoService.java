package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(long amount, BankAccount account) {
        account.updateBalance(account.getBalance() + amount);
        System.out.println("카카오 서비스로 " + amount + "원이 입금되었습니다.");
    }

    @Override
    public boolean withdraw(long amount, BankAccount account) {
        if (account.getBalance() >= amount) {
            account.updateBalance(account.getBalance() - amount);
            return true;
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        }
        return false;
    }
}
