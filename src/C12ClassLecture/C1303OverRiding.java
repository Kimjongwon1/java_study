package C12ClassLecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1303OverRiding {
    public static void main(String[] args) {
//        상속관계 일 때 부모 클래스 타입을 자식 클래스 객체의 타입으로 지정 가능
//        animal 클래스에 정의된 메소드만 사용가능하도록 제약
       cat cc = new cat();
       cc.sound();
       animal dd = new dog();
       dd.sound();

       List<String> myli = new LinkedList<>();
        
    }

}
class animal{
    void sound(){
        System.out.println("동물을 소리를 내용");
    }
}
class dog extends animal{
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
class cat extends animal{
    @Override
    void sound() {
        System.out.println("애옹애옹");
    }
}
