package src.main.java.threads;

public class Application {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        MyThread myThread = new MyThread("myThread");
        myThread.start ();

        MyRunnable myRunnable = new MyRunnable("Tread Runnable");
        Thread thread2 = new Thread(myRunnable);
        thread2.start();



        new Thread (() -> {
            for (int i = 0; i<20; i++) {
                System.out.println("Lambda thrad : " + i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Thread.interrupted();


        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i<=10; i++)
                {
                    System.out.println("Anonimus class instanse : " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
        }
    }

