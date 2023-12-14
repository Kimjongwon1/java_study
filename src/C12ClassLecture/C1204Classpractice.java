package C12ClassLecture;

public class C1204Classpractice {
    public static void main(String[] args) {
//          실습
//        클래스명:BankAccount
//        객체변수 : 계좌번호(account_number),balance(잔고,int)
//        -계좌번호 setter,잔고 setter(선택)
//        메소드: 예금(deposit),인출(withdraw)
//        1-1)deposit에 잔액이 충분해야 인출 메소드
//        1-2)잔액 얼마 남았는지 확인하는 메소드
//        1-3)예금

        BankAccount Account = new BankAccount("12345");
        Account.getmoney(123456);
        System.out.println(Account.getAccount_number());
        Account.deposit();
        Account.withdraw(13456);
        Account.deposit();

        BankAccount hun = new BankAccount("1234");
        hun.getmoney(12345);
        hun.deposit();
        hun.withdraw(3445);
        hun.deposit();

    }
}
class BankAccount{
    private int account_number;
    private int blance;
//    생성자란 클래스가 객체화 될 때 자동으로 실행되는 메소드
//    별도의 생성자를 만들지 않으면 매개변수없는 기본생성자가 숨겨져있음
//    생성자 형태
//BankAccount(){
//
//}
BankAccount(String AccountNumber){
        this.account_number = Integer.parseInt(AccountNumber);
}
    public int getAccount_number() {
        return account_number;
    }


    public int getBlance() {
        if(blance>0){
            System.out.println("잔고입니다 :" + blance + "원");
        }else{
            System.out.println("잔고부족");
        }
        return 0;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

  void deposit(){
        getBlance();
    }
  void withdraw(int a){
      blance -=a;
      System.out.println("인출 후 잔액 "+blance+"원");
    }
    public void getmoney(int a){
        blance += a;
        System.out.println("입금 후 잔액 "+blance+"원");
    }
}

