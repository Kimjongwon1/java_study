package C17ExceptionFileParsing;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class C1701Exception {
    public static void main(String[] args) {
//        ArithmeticException : 0으로 나눌때
//        예외가 발생할것으로 예상되는 코드에 try catch로 감싸줌
//        System.out.println("나눗셈프로그램입니다 숫자 10에 나눌 분모값을 입력해주세요");
//        int num =10;
//        Scanner sc = new Scanner(System.in);
//        try {
//            int input = sc.nextInt();
//            System.out.println("10에" +input+
//                    "을 나누면" + num/input + "입니다." );
//        }catch (InputMismatchException e){
//            System.out.println("정상값이 아닙니다.");
//            e.printStackTrace();
//        }catch (ArithmeticException e){
//            //catch에는 발생가능한 예외상황을 적어야 정상적으로 캐치됨
//            System.out.println("분모에 0을 쓰지마세요");
//            System.out.println(e.getMessage()); //예외관련 정보 들어있음
//            e.printStackTrace();
//        }catch (Exception e){
//            System.out.println("알수없는 예외 발생");
//            e.printStackTrace();
//        }
//        finally {
//
//        }
//        System.out.println("ㄳㄳ");
//        // 예외는 순차적으로 위에서부터


//        throw와 throws 예제
        String password = "1234";
        try {
            login(password);
        }catch (IllegalArgumentException e){
            //e.getMessage()는 login메소드에서 throw new 한 곳에서 넘어온 메시지다.
            System.out.println(e.getMessage());
        }


    }
//    unchecked exception에서 throws를 하지않더라도 예외는 호출한곳으로 전파
//    이때에 throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것

//    checked exception은 예외처리가 강제되고, 해당메소드에서 예외처리를 하던지, throws를 통해 호출한 곳에 위임
//    이때에 호출한 쪽에서 예외처리 강제
    static void login(String password)throws IllegalArgumentException{
        if(password.length()<10){
            throw new IllegalArgumentException("비번 is Too short!");
        }
    }
}
