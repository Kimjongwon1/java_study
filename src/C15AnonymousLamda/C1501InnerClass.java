package C15AnonymousLamda;

public class C1501InnerClass {
//   

    public static void main(String[] args) {
        Outer.StaticInnerClass si = new Outer.StaticInnerClass();
        si.display();
    }
}
//일반내부클래스
class Outer{
//    static 내부클래스
//     이 클래스는 C1501의 정적멤버처럼 활용
    static class StaticInnerClass{
        private  int data;
        void display(){
            System.out.println("data 값은 "+ data + "에용");
        }
    }
}
