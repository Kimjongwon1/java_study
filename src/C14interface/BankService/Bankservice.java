package C14interface.BankService;

public interface Bankservice {
    void deposit(BankAccount_real ss);
    void withdraw(BankAccount_real ss,int a);
    void getmoney(BankAccount_real ss,int blance);
    void create_account(BankAccount_real ss,int account_number);
    void getAccount(BankAccount_real ss);

    void pushmoney(BankAccount_real ss,int a);

}
