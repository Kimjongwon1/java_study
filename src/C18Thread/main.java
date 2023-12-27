package C18Thread;

public class main {
    public static void main(String[] args) {
//        Thread et1 = new ExtendsThreadClass();
//        et1.start();
//        Thread et2 = new ExtendsThreadClass();
//        et2.start();
//        Thread et3 = new ExtendsThreadClass();
//        et3.start();
////      스레드 실행시 순차적으로 실행되지 않을수 있음
////        Thread 생성자로 Runnable객체를 주입하는 방식
////        Thread 클래스에 Runnalbe객체가 전달되어 사용자가 정의한 run 메소드 실행
//        Thread rt1 = new Thread(new RunnableImplementsClass() );
//        rt1.start();
//        new Thread(() -> System.out.println("익명객체Thread")).start();

//        쓰레드의 동시성이슈테스트
//        단일스레드의 일반호출
//        for(int i = 0; i<=1000;i++)
//        {
//            Library.borrowBook();
//        }
//        System.out.println("최종 수량 : " + Library.book_count);
        for(int i = 0; i<=1000;i++)
        {
//            Thread nsx = new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            });
          Thread n_ee = new Thread(Library::borrowBook);
          n_ee.start();
//        join() 메소드를 통해 다른 스레드의 완료전까지 다른스레가 실행되지 않게 막음
//            try {
//                n_ee.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

      System.out.println("최종 수량 : " + Library.book_count);
    }
}

