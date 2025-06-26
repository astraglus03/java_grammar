package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자의 입출력을 받아 처리하는 계층.
public class MemberController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1) 회원가입 2) 회원상세조회 3) 회원목록조회 4) 로그인");
            String input = sc.nextLine();

            switch(input){
                case "1" ->{
//                    이름, 이메일, 패스워드 입력받아서 service에 전달.
                    System.out.println("이름:");
                    String name = sc.nextLine();
                    System.out.println("이메일:");
                    String email = sc.nextLine();
                    System.out.println("패스워드:");
                    String password = sc.nextLine();
                    try{
                        memberService.register(name, email, password);
                        System.out.println("회원가입이 완료되었습니다.");
                    } catch (IllegalArgumentException e) {
//                        예외발생시 적절한 문구를 사용자에게 출력.
                        System.out.println("오류가 발생했습니다. 오류 내용: " + e.getMessage());
                    }

                }
                case "2" -> {
//                    회원정보 출력
                    System.out.println("회원 상세 조회를 위해 ID를 입력해주세요.");
                    Long id = Long.parseLong(sc.nextLine());
                    try{
                        Member member = memberService.findById(id);
                        System.out.println("회원 정보: " + member);
//                        적절한 예외처리 필요
                    }catch(IllegalArgumentException e){
                        System.out.println("오류가 발생했습니다. 오류 내용: " + e.getMessage());
                    }
                }
                case "3" -> {
//                    회원목록정보 출력
                    System.out.println("회원 목록 조회입니다.");
                    List<Member> members = memberService.findAll();
                    if(members.isEmpty()){
                        System.out.println("등록된 회원이 없습니다.");
                    }else{
                        for(Member member : members){
                            System.out.println("회원 정보: " + member);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("로그인을 위해 이메일과 패스워드를 입력해주세요.");
                    try {
                        String email = sc.nextLine();
                        String password = sc.nextLine();
                        memberService.login(email, password);
                        System.out.println("로그인 성공!");
                    } catch(IllegalArgumentException e) {
                        System.out.println("오류가 발생했습니다. 오류 내용: " + e.getMessage());
                    } catch(NoSuchElementException e){
                        System.out.println("오류가 발생했습니다. 오류 내용: " + e.getMessage());
                    }
                }
                default -> {
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                }
            }
        }
    }
}
