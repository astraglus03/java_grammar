package c02ClassBasic;

import java.io.*;
import java.util.*;

public class C09BankService {
    public static void main(String[] args) throws IOException {
//        BankAccount객체를 담아둘 자료구조 선언
        List<BankAccount> accounts = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {
            System.out.println("원하시는 서비스를 선택해주세요. (1: 계좌 생성, 2: 계좌 조회, 3: 입금, 4: 출금, 5: 송금, 6: 종료)");
            int number = Integer.parseInt(br.readLine());
            switch (number) {
                case 1:
                    System.out.println("계좌번호와 현재가지고 계신 돈을 입력하세요. (계좌번호는 띄어쓰기 없으며 계좌번호와 현재금액은 한칸 띄어쓰기 필수이며 계좌번호 -은 포함하지 않습니다. 계좌번호, 금액 순서로 입력해주세요.)");
                    String[] input = br.readLine().split(" ");
                    if (input.length != 2) {
                        System.out.println("계좌 생성 서비스는 계좌번호와 현재금액을 입력해야 합니다.");
                        break;
                    }

                    accounts.add(
                            new BankAccount(
                                    BankAccount.accountCount,
                                    BankAccount.accountCount + "번째 사람",
                                    input[0], // 계좌번호
                                    Long.parseLong(input[1]) // 잔액
                            )
                    );
                    System.out.println( accounts.get(BankAccount.accountCount).getName() + "고객님!"
                            + accounts.get(BankAccount.accountCount).getAccountNumber() + "계좌가 개설되었습니다. 현재 잔액은 "
                            + accounts.get(BankAccount.accountCount).getBalance() + "원 입니다.");
                    BankAccount.accountCount += 1;
                    break;
                case 2:
                    System.out.println("계좌조회서비스입니다. 계좌번호를 입력해주세요. (계좌번호는 띄어쓰기 없으며 계좌번호 -은 포함하지 않습니다.)");
                    String accountNumber = br.readLine();

                    //계좌 개설 안하고 조회하는경우 에러발생해서 null 체크 추가
                    boolean found = false;
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(accountNumber)) {
                            System.out.println("현재 남은 잔고는 " + account.getBalance() + "원 입니다.");
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("해당 계좌번호는 존재하지 않습니다. 계좌번호를 다시 확인해주세요.");
                    }
                    break;

                case 3:
                    System.out.println("입금서비스입니다. 계좌번호와 입금할 금액을 입력해주세요. (계좌번호는 띄어쓰기 없으며 계좌번호와 입금금액은 필수이며 계좌번호 -은 포함하지 않습니다. 계좌번호, 입금금액 순서로 입력해주세요.)");
                    String[] depositInput = br.readLine().split(" ");
                    if (depositInput.length != 2) {
                        System.out.println("입금 서비스는 계좌번호와 입금금액을 입력해야 합니다.");
                        continue;
                    }

                    //계좌 개설 안하고 조회하는경우 에러발생해서 null 체크 추가
                    boolean accountFound = false;
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(depositInput[0])) {
                            long depositAmount = Long.parseLong(depositInput[1]);
                            account.deposit(depositAmount);
                            accountFound = true;
                            break;
                        }
                    }
                    if (!accountFound) {
                        System.out.println("해당 계좌번호는 존재하지 않습니다. 계좌번호를 다시 확인해주세요.");
                    }
                    break;

                case 4:
                    System.out.println("출금서비스입니다. 계좌번호와 출금할 금액을 입력해주세요. (계좌번호는 띄어쓰기 없으며 계좌번호와 출금금액은 한칸 띄어쓰기 필수이며 계좌번호 -은 포함하지 않습니다. 계좌번호, 출금금액 순서로 입력해주세요.)");
                    String[] withdrawInput = br.readLine().split(" ");
                    if (withdrawInput.length != 2) {
                        System.out.println("출금 서비스는 계좌번호와 입금금액을 입력해야 합니다.");
                        continue;
                    }

                    //계좌 개설 안하고 조회하는경우 에러발생해서 null 체크 추가
                    boolean withdrawAccountFound = false;
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(withdrawInput[0])) {
                            long withdrawAmount = Long.parseLong(withdrawInput[1]);
                            account.withdraw(withdrawAmount);
                            withdrawAccountFound = true;
                        }
                    }
                    if (!withdrawAccountFound) {
                        System.out.println("해당 계좌번호는 존재하지 않습니다. 계좌번호를 다시 확인해주세요.");
                    }
                    break;
                case 5:
                    System.out.println("송금서비스입니다. 송금할 계좌번호와 받는 계좌번호, 송금할 금액을 입력해주세요. (계좌번호는 띄어쓰기 없으며 송금계좌, 송금할계좌, 출금금액은 한칸씩 띄어쓰기 필수이며 계좌번호 -은 포함하지 않습니다. 송금계좌번호, 받는계좌번호, 송금금액 순서로 입력해주세요.)");
                    String[] transferInput = br.readLine().split(" ");
                    if (transferInput.length != 3) {
                        System.out.println("송금 서비스는 송금계좌번호, 받는계좌번호, 송금금액을 입력해야 합니다.");
                        continue;
                    } else {
                        String senderAccountNumber = transferInput[0];
                        String receiverAccountNumber = transferInput[1];
                        long transferAmount = Long.parseLong(transferInput[2]);

                        BankAccount senderAccount = null;
                        BankAccount receiverAccount = null;

                        for (BankAccount account : accounts) {
                            if (account != null && account.getAccountNumber().equals(senderAccountNumber)) {
                                senderAccount = account;
                            }
                            if (account != null && account.getAccountNumber().equals(receiverAccountNumber)) {
                                receiverAccount = account;
                            }
                        }
                        if (senderAccount == null) {
                            System.out.println("송금계좌번호가 존재하지 않습니다. 계좌번호를 다시 확인해주세요.");
                            continue;
                        } else if (receiverAccount == null) {
                            System.out.println("받는계좌번호가 존재하지 않습니다. 계좌번호를 다시 확인해주세요.");
                            continue;
                        } else {
                            senderAccount.transfer(receiverAccount, transferAmount);
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

class BankAccount {

    // 계좌 생성시마다 증가하는 id 값
    static int accountCount = 1;

    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    public BankAccount(int id, String name, String accountNumber, long balance) {
        this.id = id;
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

    //    입금하는 메서드
    public void deposit(long money) {
        this.balance += money;
        System.out.println("입금이 완료되었습니다. 잔액은: " + this.balance + "원 입니다.");
    }

    //    출금하는 메서드
    public void withdraw(long money) {
        // 잔액이 부족한 경우
        if (this.balance < money) {
            System.out.println("잔액이 부족합니다. 출금이 불가능합니다.");
        } else {
            this.balance -= money;
            System.out.println("출금이 완료되었습니다. 잔액은: " + this.balance + "원 입니다.");
        }
    }

    //    계좌이체하는 메서드
//    매개변수로 BankAccount 또는 String의 accountNumber 둘 다 가능.
    public void transfer(BankAccount targetAccount, long money) {
        // 잔액이 부족한 경우
        if (this.balance < money) {
            System.out.println("잔액이 부족합니다. 송금이 불가능합니다.");
        } else {
            this.balance -= money;
            targetAccount.balance += money;
            System.out.println("송금이 완료되었습니다. 잔액은: " + this.balance + "원 입니다.");
        }
    }
}