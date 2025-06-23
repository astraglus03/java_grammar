package C04Interface.BankService;

import java.io.BufferedReader;
import java.io.IOException;

public class BankController extends BankService {
    public static void main(String[] args) throws IOException{
        System.out.println("계좌번호를 입력해주세요.");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String accountNumber = br.readLine();
        BankAccount ba = new BankAccount(accountNumber);

        while(true){
            System.out.println("1. 입금 2. 출금 3. 잔액조회 4. 종료");
            String serviceNumber = br.readLine();
            switch(serviceNumber){
                case "1":
                    System.out.println("입금하실 금액을 입력해주세요.");
                    Long money = Long.parseLong(br.readLine());
//                    서비스계층이 있다면 이 돈을 입금


            }
        }

    }
}
