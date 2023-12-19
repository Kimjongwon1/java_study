package C12ClassLecture;
//super():부모클래스의 생성자를 의미 , super 키워드 -> 부모 키워드 의미

public class C1302SuperChild extends Superparents{
    int b;
    int a;
    C1302SuperChild(){
        super(100);
        a =30;
        b =20;
    }
    void display(){
        super.display();
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }
    public static void main(String[] args) {
            C1302SuperChild sc = new C1302SuperChild();
        System.out.println(sc.a);
        System.out.println(sc.b);
        sc.display();
    }

}
class Superparents{
    int a;
    Superparents(int a){
        this.a=a;
    }
    void display(){
        System.out.println("모 부 클 래 스");
    }
}
