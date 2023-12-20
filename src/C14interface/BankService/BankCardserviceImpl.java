package C14interface.BankService;

public class BankCardserviceImpl implements Bankservice{
    @Override
    public void deposit(BankAccount_real ss) {
        int depost = ss.getBlance();
        System.out.println("잔액은 " + depost);
    }

    @Override
    public void withdraw(BankAccount_real ss,int a) {
        ss.setBlance(ss.getBlance()-a);
        int blance = ss.getBlance();
        System.out.println("인출 후 잔액 "+blance+"원");
    }

    @Override
    public void getmoney(BankAccount_real ss,int a) {
        ss.setBlance(ss.getBlance()+a);
        int blance = ss.getBlance();
        System.out.println("입금 후 잔액 "+blance+"원");
    }

    @Override
    public void create_account(BankAccount_real ss,int a) {
        ss.setAccount_number(a);
    }

    @Override
    public void getAccount(BankAccount_real ss) {
        int ab =ss.getAccount_number();
        System.out.println("계좌는 " + ab + "입니다");
    }

    @Override
    public void pushmoney(BankAccount_real ss, int a) {
        ss.setBlance(ss.getBlance()+a);
        System.out.println(ss.getBlance());
    }
}
