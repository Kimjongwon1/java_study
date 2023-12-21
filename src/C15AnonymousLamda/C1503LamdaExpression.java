package C15AnonymousLamda;

public class C1503LamdaExpression {
    public static void main(String[] args) {
//        실행문 1개일때에는 return 생략가능
//        실행문 2개 이상일때에는 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.
//        Lamdainterface a = (a1, b) -> a1+b;
        Lamdainterface a = (a1, b) ->
        {
        String answer = a1+b;
        return answer;
        };
//        a.makeString("st","r");
        System.out.println(a.makeString("a","b"));
    }
}
interface Lamdainterface{
//    void makeString(String a, String b);
String makeString(String a, String b);
}
