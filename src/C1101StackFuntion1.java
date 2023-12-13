public class C1101StackFuntion1 {
    public static void main(String[] args) {
        System.out.println("main 함수시작");
        function1();
        System.out.println("main 함수끝");
    }
    static void function1(){
        System.out.println("function시작");
        function2();
        System.out.println("function끝");
    }
    static void function2(){
        System.out.println("function1시작");

        System.out.println("function1끝");
    }
}
