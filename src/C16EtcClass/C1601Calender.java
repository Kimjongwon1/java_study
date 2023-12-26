package C16EtcClass;
import java.time.temporal.ChronoField;
import java.util.*;
import java.time.*;
public class C1601Calender {
    public static void main(String[] args) {
//        날짜관련 클래스 : Calender(java.util), java.time 패키지에 있는 LocalDate 클래스
//            Calendar time = Calendar.getInstance();
////        System.out.println(time.getTime());
//////        특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
////        System.out.println(time.get(Calendar.YEAR));
////        System.out.println(time.get(Calendar.MONTH)+1);
////        System.out.println(time.get(Calendar.DAY_OF_MONTH));
////        System.out.println(time.get(Calendar.DAY_OF_WEEK));
////        System.out.println(time.get(Calendar.HOUR));
////        System.out.println(time.get(Calendar.MINUTE));
////        System.out.println(time.get(Calendar.SECOND));
////        java.time.*;
//        LocalDate present_time= LocalDate.now();
//        System.out.println(present_time);
//
//        LocalDateTime ThisTime = LocalDateTime.now();
//        System.out.println(ThisTime);

//        임의로 특정시간을 만들고 싶을 때 : of 메소드
        LocalDate birTh = LocalDate.of(1980,02,19);
        System.out.println(birTh.getYear());
        System.out.println(birTh.getMonth());
        System.out.println(birTh.getDayOfMonth());
//        일반 내장 메소드
        LocalTime birThTime = LocalTime.of(9,02,19);
        LocalDateTime birthDayTime = LocalDateTime.of(birTh,birThTime);
        System.out.println(birthDayTime);
//        크로노 필드 enum 타입 : 매개변수로 크로노필드를 받아 프로그램 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
//        0 : 오전, 1 : 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
//      현재시간은 오전/오후입니다.
        if(birthDayTime.get(ChronoField.AMPM_OF_DAY) == 0){
            System.out.println("오전입니다.");
        }else{
            System.out.println("오후입니다");
        }
    }
}
