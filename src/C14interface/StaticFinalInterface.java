package C14interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        Myimple ss = new Myimple();
        ss.methodA();


        int myConstant = Myinterface.my_constant;
    }
}

interface Myinterface{
//    아래 변수는 컴파일 타입에 static final이 붙는다.
  int my_constant = 100;
    void methodA();
}
class Myimple implements Myinterface{

    @Override
    public void methodA() {
        System.out.println("ㅎㅇㅎㅇ");
    }
}