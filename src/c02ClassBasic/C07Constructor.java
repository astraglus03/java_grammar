package c02ClassBasic;

import java.util.*;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성: 연도, 월, 일 세팅

        Calendar calendar = new Calendar("2023","06","12");
//        캘린더 객체 출력: "오늘은 XX년도 XX월 XX일 입니다."
//        toString()메서드는 특별한 메서드로 객체명을 출력할때 자동으로 실행
        calendar.printDate();

    }
}

// calendar 클래스 생성 : year, month, day 모두 String

class Calendar{
    private String year;
    private String month;
    private String day;

    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    위의 별도 생성자를 추가할경우, 초기(기본)생성자는 무시가 되므로, 필요시 별도로 추가


    public void printDate(){
        System.out.println("오늘은 " + year + "년도 " + month + "월 " + day + "일 입니다.");
    }
}