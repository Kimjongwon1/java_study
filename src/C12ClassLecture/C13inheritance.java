package C12ClassLecture;

//extends 키워드를 통해 상속관계를 표현
public class C13inheritance extends parents {
    int c= 20;
    public static void main(String[] args) {
        C13inheritance hi = new C13inheritance();
        System.out.println(hi.c);
        System.out.println(hi.a);
//        hi.b    //자식클래스라 하더라도 private변수는 상속 및 접근 불가
        hi.childe();
        hi.parentMethod();
    }
    void childe(){
        System.out.println("자 식 클 래 스");
    }
//    부모클래스의 메소드명을 동일하게 사용함으로서 메소드 오버라이딩(덮어쓰기)됐다.

//    @Override
//    void parentMethod() {
//        System.out.println("부모큵래스가 아니라 자식클래스다");
//    }
}
class parents{
    int a = 10;
    private int b = 20;
    
    void parentMethod(){
        System.out.println("부 모 클 래 스");
    }
}

