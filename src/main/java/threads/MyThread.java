package src.main.java.threads;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public void run () {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }





}
