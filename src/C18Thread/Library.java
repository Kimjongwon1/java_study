package C18Thread;

public class Library {
    static int book_count = 100;
    //public static void borrowBook()
//    syncronized키워드를 통해 해당메소드에 한해서 lock을 걸도록 설정
    public synchronized static void borrowBook(){
        if(book_count>0){
//            책을 빌리는 시간을 10밀리초로 가정.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                 System.out.println(e.getMessage());
            }
            book_count-=1;
            System.out.println("대출 완료");
            System.out.println("남은 수량 : " + book_count);
        }else{
            System.out.println("대출 불가");
        }
    }
}
