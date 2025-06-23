package C04Interface.BankService;


public interface BankService {

    void deposit(long amount, BankAccount account); // 입금 메서드
    boolean withdraw(long amount, BankAccount account); // 출금 메서드

}
