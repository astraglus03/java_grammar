package c02ClassBasic;

import java.util.*;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2개정도 add
        Account account1 = new Account("김진호", "21234572", 842738430);
        Account account2 = new Account("이우영", "87984231", 904972970);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);

        accountList.get(0).printAccountInfo();

    }
}

// Account 클래스 생성

class Account{
    private String name; // 계좌주명
    private String accountNumber; // 계좌번호
    private long balance; // 잔액

    public Account(String name, String accountNumber, long balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    public void printAccountInfo() {
        System.out.println("계좌주명: " + name);
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
    }
}