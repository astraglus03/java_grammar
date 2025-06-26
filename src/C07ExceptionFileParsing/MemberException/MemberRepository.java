package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층.
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

//    회원가입
    public void register(Member member){
        memberList.add(member);
    }

//    회원 상세조회
    public Optional<Member> findById(Long id){
        return memberList.stream()
                .filter(member -> member.getId().equals(id))
                .findFirst();
    }

//    이메일 상세조회
    public Optional<Member> findByEmail(String email){
        return memberList.stream()
                .filter(member -> member.getEmail().equals(email))
                .findFirst();
    }


//    회원 목록조회
    public List<Member> findAll(){
        return memberList;
    }

////    로그인
//    public void login(String email, String password){
//        return memberList.stream().filter(e -> e.getEmail().equals(email) && e.getPassword().equals(password)).findFirst();
//    }
}
