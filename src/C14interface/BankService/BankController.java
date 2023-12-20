package C14interface.BankService;

import java.util.Scanner;
import java.util.*;

public class BankController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankservice se = new BankserviceImpl();
        BankAccount_real ss = new BankAccount_real();
        Bankservice se2 = new BankCardserviceImpl();
        boolean a = true;
        while (a){
            System.out.println("서비스를 선택하세요 1: 카드 2: 은행 3:종료");
            int push = sc.nextInt();
            switch (push){
                case 1 :if(ss.getAccount_number()==0){
                    System.out.println("계좌를 만드세요");
                    int scv = sc.nextInt();
                    se.create_account(ss,scv);
                    se.getAccount(ss);
                }else {
                   int account_num = ss.getAccount_number();
                    System.out.println("현재 계좌번호는 "+ account_num);
                }
                    se.deposit(ss);
                    break;
                case 2 :
                    if(ss.getAccount_number()==0){
                        System.out.println("카드를 만드세요");
                        int scv1 = sc.nextInt();
                        se2.create_account(ss,scv1);
                        se2.getAccount(ss);
                    }else {
                        int account_num = ss.getAccount_number();
                        System.out.println("현재 계좌번호는"+ account_num);
                    }
                    se2.deposit(ss);
                    break;
                case 3:
                    a=false;
                    break;
            }
            System.out.println("1: 입급 2:출금 3:잔고 및 계좌번호 확인, 종료하시려면 아무숫자나 입력하세요");
            int push2 = sc.nextInt();
            if(push2 == 1){
                System.out.println("입금 금액은 : ");
                int scq = sc.nextInt();
                se.getmoney(ss,scq);
            } else if (push2 == 2) {
                System.out.println("출금 금액은 : ");
                int scp = sc.nextInt();
                se.withdraw(ss,scp);
            } else if (push2 == 3) {
                System.out.println("잔고 : " + ss.getBlance());
                System.out.println("계좌 : " + ss.getAccount_number());
            }else{
                a=false;
                break;
            }

        }

    }
}
