package src.main.java.threads;

public class Application {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        MyThread myThread = new MyThread("myThread");
        myThread.start ();

        MyRunnable myRunnable = new MyRunnable("Tread Runnable");
        Thread tread2 = new Thread(myRunnable);
        tread2.start();
    }
}
