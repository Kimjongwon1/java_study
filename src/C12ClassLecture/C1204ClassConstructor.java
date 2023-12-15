package C12ClassLecture;

import java.util.Calendar;

public class C1204ClassConstructor {
    public static void main(String[] args) {
//    내부클래스 생성 : Calender
//    인스턴스 변수 : year, month, day -> String
//    생성자 1 : year, month , day 를 매개변수로 받아 세팅
//    생성자 2 : year, month
//    생성자 3 : 없음
       Calender Cal = new Calender("2023","12","01");
        System.out.println(Cal.getDay());
       Calender Cal1 = new Calender("2023","12");
        System.out.println(Cal1.getMonth());
       Calender Cal2 = new Calender();
            Cal2.setYear("2023");
            Cal2.setMonth("11");
            Cal2.setDay("11");
        System.out.println(Cal2.getYear());

    }
}
class Calender {
    private String year;
    private String month;
    private String day;
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    Calender(String year,String month,String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    메소드 오버로딩을 통해 같은 이름의 생성자 생성가능
    Calender(String year,String month){
        this.year = year;
        this.month = month;

    }
//    this()키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출
    Calender(String year){
        this(year,null,null);

    }
    Calender() {


    }
   /* @Override
    public String toString() {
        return "Year: " + year + ", Month: " + month + ", Day: " + day;
    }*/
}


