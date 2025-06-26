package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심로직을 구현하는 계층
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password) throws IllegalArgumentException {
//        DB에 이메일이 중복일 경우 예외 발생.
//        if(memberRepository.findAll().stream().anyMatch(member -> member.getEmail().equals(email))){
//            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
//        }
        if (memberRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
        }

//        이메일 형식에 맞지 않는 경우
        if (!ValueValidator.isValidEmail(email)) {
            throw new IllegalArgumentException("유효하지 않은 이메일 형식입니다.");
        }

//        비밀번호가 너무 짧은경우 예외 발생.
        if (password.length() < 6) {
            throw new IllegalArgumentException("비밀번호는 6자 이상이어야 합니다.");
        }
//        객체 조립후 repository를 통해 register
        Member member = new Member(name, email, password);
        memberRepository.register(member);
    }

    //    회원상세조회
    public Member findById(Long id) throws IllegalArgumentException {
//        Optional 객체에 값이 없을경우 예외발생. 있으면 Member를 꺼내서 return.
//        Optional<Member> optionalMember = memberRepository.findById(id);
//        if(optionalMember.isPresent()){
//            return optionalMember.get();
//        }
//        throw new IllegalArgumentException("해당 ID의 회원이 존재하지 않습니다.");
        return memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 ID의 회원이 존재하지 않습니다."));


//        for (Member member : memberRepository.findAll()) {
//            if (member.getId() == id) {
//                return member;
//            }
//        }
//        throw new IllegalArgumentException("해당 ID의 회원이 존재하지 않습니다.");
    }

//    회원 목록조회

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

//    public Member login(String email, String password) throws IllegalArgumentException {
//        Optional<Member> optMem = memberRepository.findByEmail(email);
//        if(!optMem.isPresent()){
//            throw new IllegalArgumentException("이메일이 존재하지 않습니다.");
//        }
//        if(!optMem.get().getPassword().equals(password)){
//            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
//        }
//        return optMem.get();
//    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Member member = this.memberRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("없는 이메일입니다."));

        if (!member.getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
    }
}
