package C18Thread;

//쓰레드 클래스에 이미 구현되어있는 run메소드는 아무작업도 하지않는 빈 메소드다
//작업하고 싶은 내용을 run메소드를 오버라이딩하여 정의 할 수도 있고 안할 수 도 있다.
//상속관계이다 보니 다른 클래스 상속 불가 -> runnable로 대체 많이 됨
public class ExtendsThreadClass extends Thread{
//    run메소드는 스레드가 시작되면 실행된다.
    @Override
    public void run(){
        System.out.println("스레드 명 반환 " + Thread.currentThread().getName());
    }
}
