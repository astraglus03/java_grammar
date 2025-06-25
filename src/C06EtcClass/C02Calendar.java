package C06EtcClass;

import java.time.temporal.ChronoField;
import java.util.*;
import java.time.*;

public class C02Calendar {
    public static void main(String[] args) {
//        java.util.Calendar : 날짜와 시간 관련 클래스

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 24시간제
        System.out.println(calendar.get(Calendar.HOUR)); // 12시간제
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 요일

        System.out.println("--------------------");
        System.out.println("LocalTime 클래스 사용 예제");

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

        System.out.println("--------------------");
        System.out.println("LocalDate 클래스 사용 예제");
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());

        System.out.println("--------------------");
        System.out.println("LocalDateTime 클래스 사용 예제");
//        java.time.LocalDateTime : 날짜와 시간 관련 클래스
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfWeek());

//        get메서드와 ChronoField매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(ldt.get(ChronoField.YEAR));
        System.out.println(ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY)); // 0:오전, 1:오후
        System.out.println(ldt.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시간제
        System.out.println(ldt.get(ChronoField.HOUR_OF_AMPM)); // 12시간제

        System.out.println("--------------------");
//        .of : 임의로 특정시간정보객체를 만들어 내고 싶을때 사용
        LocalDate birthday = LocalDate.of(2000,11,12);
        System.out.println(birthday);

        LocalDateTime birthdayTime = LocalDateTime.of(2000,11,12,10,30,45);
        System.out.println(birthdayTime);


    }
}
