package C04Interface.BankService;

public class BankAccount {
    private String accountNumber; // 계좌번호
    private long balance; // 잔액

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
    }
//    최종 금액을 통해 update : 아래 메서드를 입/출금 모두에 활용.
    public void updateBalance(long balance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }


}
