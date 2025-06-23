package C04Interface.BankService;

import java.io.BufferedReader;
import java.io.IOException;

public class BankControllerOriginal{
    public static void main(String[] args) throws IOException{
        System.out.println("계좌번호를 입력해주세요.");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String accountNumber = br.readLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;

        while(true){
            System.out.println("1. 입금 2. 출금" );
            String serviceNumber = br.readLine();
            switch(serviceNumber){
                case "1":

                    System.out.println("입금하실 방법을 선택해주세요. 1. 카카오 2. 토스");
                    String depositMethod = br.readLine();
//                    서비스계층이 있다면 이 돈을 입금
                    if(depositMethod.equals("1")){
                        bs = new BankKakaoService();
                    } else if(depositMethod.equals("2")){
                        bs = new BankTossService();
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                        continue;
                    }
                    System.out.println("입금하실 금액을 입력해주세요.");
                    long money = Long.parseLong(br.readLine());
                    bs.deposit(money, ba);

                    System.out.println("입금이 완료되었습니다. 현재 잔액: " + ba.getBalance());
                    break;
                case "2":
                    System.out.println("출금하실 방법을 선택해주세요. 1. 카카오 2. 토스");
                    String depositMethods = br.readLine();
//                    서비스계층이 있다면 이 돈을 입금
                    if(depositMethods.equals("1")){
                        bs = new BankKakaoService();
                    } else if(depositMethods.equals("2")){
                        bs = new BankTossService();
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                        continue;
                    }
                    System.out.println("출금하실 금액을 입력해주세요.");
                    long withdrawMoney = Long.parseLong(br.readLine());

                    if(bs.withdraw(withdrawMoney, ba)){
                        System.out.println("출금이 완료되었습니다. 현재 잔액: " + ba.getBalance());
                    } else {
                        System.out.println("출금에 실패했습니다. 현재 잔액: " + ba.getBalance());
                    }
                    break;
            }
        }

    }
}
