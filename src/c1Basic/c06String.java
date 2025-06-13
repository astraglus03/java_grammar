package c1Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class c06String {
    public static void main(String[] args) throws IOException {
//        원시자료형은 스택메모리에 저장되므로, 비교시 값자체를 비교
//        String st1 = new String("Hello");
//        String st2 = new String("Hello");
//
//        System.out.println(st1 == st2);
//        System.out.println(st1.equals(st2));

//        Wrapper 클래스는 객체로 생성되므로, 주소값을 비교하게 됨.
//        int i1 = 10;

//        Integer ig1 = new Integer(10);
//        오토박싱: 원시자료형 -> Wrapper 클래스 자동 형변환
//        Integer ig1 = 10;
//        오토언박싱: Wrapper클래스 -> 원시자료형 자동 형변환
//        int i2 = ig1;

//        Wrapper클래스의 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(st3);

//        배열(참조자료형)에는 원시타입 자료형 세팅 가능
//        int[] arr = {10,20,30};

//        그외(리스트, set, map) 등에는 참조자료형을 세팅해야함.

//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        String 선언방식 2가지
//        객체 선언 방식
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        리터럴방식
//        String str3 = "Hello";
//        String str4 = "Hello";
//
//        System.out.println(str1 == str2); // false, 주소값 비교
//        System.out.println(str3 == str4); // true, 리터럴은 동일한 주소를 참조

//        참조자료형의 비교는 ==을 지양
//        System.out.println(str1.equals(str2)); // true, 내용 비교
//
//        String st1 = "Hello1 World2 Java3";
//        System.out.println(st1.length());

//        charAt(n) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//        System.out.println(ch1);

//        위 문자열의 소문자알파벳의 개수구하기: for,length, charAt 사용
//        Integer lowerCount = 0;

//        for(int i=0; i<st1.length() ; i++){
//            char ch = st1.charAt(i);
//            if(ch >= 'a' && ch <= 'z'){
//                lowerCount++;
//            }
//        }
//        System.out.println(lowerCount);

//        a의 갯수 출력
//        String st2 = "abcdeaaaakeqwf";

//        Integer count = 0;

//        for(int i=0; i< st2.length(); i++){
//            if(st2.charAt(i) =='a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        toCharArray() : String문자열을 char배열로 리턴
//        int count2 =0;

//        for(char c :  st2.toCharArray()){
//            if(c=='a') count2++;
//        }

//        index(문자열) : 특정 문자열의 위치(index) 반환. 가장 먼저 나오는 문자열의 위치 반환.
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//
//         contains : 특정 문자열이 포함되어 있는지 여부를 boolean으로 반환
//        System.out.println(st1.contains("java"));

//        문자열 더하기
//        String st2 = "Hello";
//        st2+='a';
//        System.out.println(st2);

//        substring(a,b): a이상 b미만의 index의 문자를 잘라 문자열 반환

//        String st1 = "Hello World";
//        System.out.println(st1.substring(0, 5)); // "Hello"
//        System.out.println(st1.substring(6,st1.length()));

//        trim, strip: 문자열 양쪽 끝의 공백 제고
//        String st1 = "   Hello World   ";
//        String trim1 = st1.trim();
//        String strip1 = st1.strip();
//        System.out.println(trim1+' '+ strip1);
//        lowerCase, upperCase: 문자열을 소문자, 대문자로 변환
//        String st1 = "Hello World";
//        String lower = st1.toLowerCase();
//        String upper = st1.toUpperCase();
//        System.out.println(lower);
//        System.out.println(upper);


//        replace(a,b): 문자열 a를 b로 변경
//        String st1 = "Hello World";
//        String replaced = st1.replace("World", "Java");
//        System.out.println(replaced);

//         replaceAll(a,b): 정규표현식 a를 b로 변경

//        String st1 = "01bcd23efg45hij6789";
//        소문자 알파벳 제거
//        String replaces = st1.replaceAll("[a-z]", "");
//        System.out.println(replaces);

//        전화번호 검증
//        String phoneNumber = "010-1234-5678";
//        boolean check = phoneNumber.matches("\\d{3}-\\d{4}-\\d{4}");
//        if(check==false){
//            System.out.println("전화번호 형식이 잘못되었습니다.");
//        } else {
//            System.out.println("전화번호 형식이 올바릅니다.");
//        }
//
////        이메일 검증
//        String email = "qwer1234@naver.com";
//        boolean check_email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        if(check_email==false){
//            System.out.println("이메일 형식이 잘못되었습니다.");
//        } else {
//            System.out.println("이메일 형식이 올바릅니다.");
//        }

//        split: 특정문자를 기준으로 잘라서 문자배열로 만드는것.
//        String b = "a b c  d";
//        String[] arr = b.split(" ");
//        String[] arr2 = b.split("\\s+"); // \s: 공백문자(스페이스, 탭 등) 하나 이상

//        String st1 = null; // null은 String이 아님
//        String st2 = ""; // 빈 문자열은 String임
//        String st3 = " ";

//        System.out.println(st1==st2);
//        System.out.println(st1.isEmpty()); // nullpointer exception 발생
//        System.out.println(st2.isEmpty());
//        System.out.println(st3.isEmpty());
//        System.out.println(st3.isBlank());

//        문자열 합치기
//        String[] arr = {"Hello", "World", "Java"};
//        String answer1="";
//        for(String a : arr){
//            answer1 += a;
//            answer1 +=" ";
//        }
//        System.out.println(answer1);

//        String answer2 = String.join(" ", arr);
//        System.out.println(answer2);

//        StringBuffer: 문자열 조립 객체
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("\n");
//        sb.append("python");
//        sb.append("\n");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);

//


    }
}
