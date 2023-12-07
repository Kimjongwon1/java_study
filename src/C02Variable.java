import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
//        byte num1= 127;
//        byte num2= -128;
////        byte sum1= (num1+1);
////        byte sum2= (num2-1);
//        num1 ++;
//        num2 --;
//        System.out.println("오버플로우" +  num1);
//        System.out.println("언더플로우" +  num2);
//        범위를 넘어가면 반대로 돌아가버림

//        실수 : Double(기본), Float
//        float f1 = 1.123456789F;
//        Double d1 = 1.123456789;
//        System.out.println("f1 : " + f1);
//        System.out.println("D1 : " + d1);
//        부동소수점 오타 테스트

//        double double_name = 0.1;
//        미세오차는 정상 출력

//        반복연산에서는 오차가 커져 오차확인이 가능해짐
//        for(초기식;조건식;증감식;){}
//        double double_name = 0;
//        for(int i=0;i<1000;i++){
//            double_name = double_name + 0.1*10;
//        }
//        System.out.println(double_name/10);
//        System.out.println(0.1);
//        System.out.println(0.1+0.1);
//        0.1*10
//                y=y/10
//    String abc = "hello";
//        BigDecimal myBig = new BigDecimal("1.03");
//        BigDecimal myBig1 = new BigDecimal("0.42");
//        BigDecimal result = myBig.subtract(myBig1);
//        double result1 = myBig.subtract(myBig1).doubleValue();
//        System.out.println(result);
//        System.out.println(result1);
////        위아래 같음
//        System.out.println(myBig.subtract(myBig1));
//      문자 char
//        char my_char = '가';
//        System.out.println(my_char);
//        논리형:참/거짓으로 구분
//        boolean : true or false
//         boolean my_bool = true;
//        System.out.println(my_bool);
////        if(my_bool==true){
////            System.out.println("조건식이 참");
////        }
////        위아래 결과 같음
//        if(my_bool){
//            System.out.println("조건식이 참");
//        }
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if(bool_num1>bool_num2){
//            System.out.println("참");
//
//        }

////        묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
//        int my_int1 = 10;
////        int -> double
//        double my_double1 = my_int1;
//        System.out.println(my_double1);
////      에러 발생 : my_int1 =my_double1;
////      명시적 타입은 가능 -> my_int1 = (int)my_double1; 소수점값 손실발생할 가능성이 있다.
//        double my_double2 = 7.2f;
//        System.out.println(my_double2);
//
////      명시적 타입변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
//        System.out.println(char_num);
////      int a가 1, int b가 4 일때 둘을 나눈값을 int에 담아 출력, double에 담아 출력
//        int a = 1;
//        int b = 4;
//        int result = a/b;
//        System.out.println(result);
//        double result1 = a/b;
//        System.out.println(result1);
//
//        double d2 = (double)a/(double)b;
////        둘중하나만 (double)로 해도 됨
//        System.out.println(d2);

//        변수와 상수
////        선언과 동시에 초기화
//        int a1 = 10;
////        변수값 변경
//        a1 = 20;
////        선언만 한 뒤에 나중에 초기화
//        int a2; //지역변수는 선언만 됐을때는 값이 0으로 초기화 되지않으나, 객체로 선언될때는 0으로 초기화
//        a2 = 20;
//        객체를 만들때는 0으로 초기화
   //         int [] arr  = new int[5];
    //    boolean [] arr  = new boolean[5];
//        String [] arr  = new String[5];
//        System.out.println(arr[1]);
////      상수는 값의 재할당이 불가하다.
//        final int AGES = 20;
////        AGES = 30; 이라고 재할당하면 에러발생
////        상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 자바 8이후 가능함
//        final int ages2;
//        ages2 = 10;

//        int는 초기화 안하고 선언만 하면 0, string은 null이 할당됨
    }
}
