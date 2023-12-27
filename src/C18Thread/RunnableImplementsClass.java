package C18Thread;

public class RunnableImplementsClass implements Runnable{

    @Override
    public void run() {
        System.out.println("RunnableImple : " + Thread.currentThread().getName());
    }
}
