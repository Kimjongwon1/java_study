package C16EtcClass;
import java.util.*;
import java.time.*;
public class C1601Calender {
    public static void main(String[] args) {
//        날짜관련 클래스 : Calender(java.util), java.time 패키지에 있는 LocalDate 클래스
            Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
////        특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK));
//        System.out.println(time.get(Calendar.HOUR));
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));
//        java.time.*;
        LocalDate present_time= LocalDate.now();
        System.out.println(present_time);

        LocalDateTime ThisTime = LocalDateTime.now();
        System.out.println(ThisTime);
    }
}
