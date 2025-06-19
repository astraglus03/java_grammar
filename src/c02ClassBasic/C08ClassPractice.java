package c02ClassBasic;

import java.util.*;

public class C08ClassPractice {
    public static void main(String[] args) {
////        객체 선언 및 List에 2개정도 add
//        Account account1 = new Account("hong1", "12345", 100000);
//        Account account2 = new Account("hong2", "54321", 100000);
//
//        List<Account> accountList = new ArrayList<>();
//        accountList.add(account1);
//        accountList.add(account2);

//        accountList.get(0).printAccountInfo();

//        for(Account a: accountList){
//            a.printAccountInfo();
//        }

////        사용자1이 사용자2에게 송금
//
//        for(Account a: accountList){
//            if(a.getAccountNumber().equals("12345")){
//                a.setBalance(a.getBalance() -50000);
//            }
//            if(a.getAccountNumber().equals("54321")){
//                a.setBalance(a.getBalance() + 50000);
//            }
//        }

//        for(Account a: accountList){
//            a.printAccountInfo();
//        }

//        Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 100000));
        accountMap.put("54321", new Account("hong1", "54321", 100000));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");

        a.setBalance(a.getBalance()-50000);
        b.setBalance(b.getBalance()+50000);

        for(String key: accountMap.keySet()){
            accountMap.get(key).printAccountInfo();
        }

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

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void printAccountInfo() {
        System.out.println("계좌주명: " + name);
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
    }
}