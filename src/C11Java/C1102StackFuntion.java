package C11Java;

public class C1102StackFuntion {
    public static void main(String[] args) {
        System.out.println("main 함수시작");
        System.out.println(function1(1));
        System.out.println("main 함수끝");
    }
    static int function1(int a){
        System.out.println("function시작");
        System.out.println("function끝");
        return function1(a*2);
    }
//    static int function2(int a){
//        System.out.println("function1시작");
//
//        System.out.println("function1끝");
//            return a*2;
//    }

}
